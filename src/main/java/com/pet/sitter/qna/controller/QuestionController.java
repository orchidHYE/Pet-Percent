package com.pet.sitter.qna.controller;

import com.pet.sitter.common.entity.Member;
import com.pet.sitter.common.entity.Question;
import com.pet.sitter.member.service.MemberService;
import com.pet.sitter.qna.dto.AnswerDTO;
import com.pet.sitter.qna.dto.QuestionDTO;
import com.pet.sitter.qna.service.QuestionService;
import com.pet.sitter.qna.validation.AnswerForm;
import com.pet.sitter.qna.validation.QuestionForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;
    private final MemberService memberService;

    //question 글 작성 폼 보여주기
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/write")
    public String writeForm(QuestionForm questionForm){
        return "qna/questionForm";
    }


    //quesiton 글 작성
    @PreAuthorize("isAuthenticated()")
    @PostMapping("/write")
    public String write(@Valid QuestionForm questionForm, BindingResult bindingResult, Principal principal,
                        QuestionDTO questionDTO, @RequestParam("file") MultipartFile[] file) throws IOException {
        if(bindingResult.hasErrors()){
            return "qna/QuestionForm";
        }
        Member member = memberService.getUser(principal.getName());
        questionService.savePost(questionDTO,questionForm, file,  member);
        return "redirect:/question/list";
    }


    //question list 조회
    @GetMapping("/list")
    public String list(Model model,@RequestParam(value = "page", defaultValue = "0") int page){
        Page<Question> questionPage = questionService.questionList(page);
        model.addAttribute("questionPage",questionPage);
        return "qna/QuestionList";

    }

    //question 상세 조회
    @GetMapping("/detail/{qnaNo}")
    public String detail(@PathVariable Long qnaNo, Model model, AnswerForm answerForm){
        QuestionDTO questionDTO = questionService.detail(qnaNo);
        model.addAttribute("questionDTO",questionDTO);
        return "qna/QuestionDetail";
    }

    //question 게시글 수정폼
    @GetMapping("/edit/{qnaNo}")
    public String edit(Model model,@PathVariable Long qnaNo,AnswerForm answerForm){
        QuestionDTO questionDTO = questionService.detail(qnaNo);

        model.addAttribute("questionDTO",questionDTO);
        return "qna/QuestionUpdate";
    }

    //question 게시글 수정
    @PostMapping ("/update")
    public String update(Long qnaNo, @ModelAttribute QuestionDTO questionDTO,@RequestParam("file") MultipartFile[] newImageFiles,AnswerForm answerForm) throws IOException {

        questionService.update(qnaNo,questionDTO,newImageFiles);
        return "redirect:/question/list";

    }

    //question 게시글 삭제
    @GetMapping("/delete/{qnaNo}")
    public String delete(@PathVariable Long qnaNo) {
        questionService.delete(qnaNo);
        return "redirect:/question/list";
    }

}