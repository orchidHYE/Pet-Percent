# PET%
<img width="416" alt="image" src="https://github.com/orchidHYE/New_petsitter/assets/131605360/9c719b33-5edf-41a7-a472-06aa235228e7">


# 프로젝트 소개
- 바쁜 현대인들 일상에서 반려동물 케어에 필요한 솔루션을 제공하는 웹 서비스
- 상황에 맞게 시터가 될 수도, 구인자가 될 수도 있는 유연한 맞춤 서비스 제공

# 1. 개발환경
| Category    | Techs    |
|---   |:---:   |
| 🖥️ Back-End     | ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white) ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)|
| 🖥️ Front-End     | ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) ![jQuery](https://img.shields.io/badge/jquery-%230769AD.svg?style=for-the-badge&logo=jquery&logoColor=white)|
| 📋 협업    | ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)|

# 2. 팀원구성 및 역할
| 팀원 | 역할 | 팀원 | 역할 |
|:-:|:-:|:-:|:-:| 
| <img src="https://avatars.githubusercontent.com/u/137588438?v=4" width="50" height="50"/><br/>[@kmyongyong](https://github.com/kmyongyong) | 관리자페이지 | <img src="https://avatars.githubusercontent.com/u/131141333?v=4" width="50" height="50"/><br/>[@mingzzzi326](https://github.com/mingzzzi326) | 메인페이지<br/>게시글 추천기능  |
| <img src="https://avatars.githubusercontent.com/u/139062385?v=4" width="50" height="50"/><br/>[@ggubuck](https://github.com/ggubuck) | 마이페이지 | <img src="https://avatars.githubusercontent.com/u/80761052?v=4" width="50" height="50"/><br/>[@losscut25](https://github.com/losscut25) | 로그인 및 회원가입 |
| <img src="https://avatars.githubusercontent.com/u/76652210?v=4" width="50" height="50"/><br/>[@favud20](https://github.com/favud20) | 매칭기능 | <img src="https://avatars.githubusercontent.com/u/128020445?v=4" width="50" height="50"/><br/>[@uu940903](https://github.com/uu940903)| | 공지사항<br/>문의게시판 |
| <img src="https://avatars.githubusercontent.com/u/131605360?v=4" width="50" height="50"/><br/>[@orchidHYE](https://github.com/orchidHYE) | 매칭게시판 |

# 3. 개발일정
**전체 프로젝트 일정**: 2023. 08 ~ 2023. 09

**상세일정**

<img width="460" alt="image" src="https://github.com/orchidHYE/New_petsitter/assets/131605360/978293ea-e9d8-46f5-b14f-3411ec5463f7">


# 4. ERD
![image](https://github.com/orchidHYE/New_petsitter/assets/131605360/d0f30cb6-5047-46b4-8069-a63ebfcc0987)

# 5. 기능
###  👤 사용자
**로그인 및 회원가입**
- KAKAO API 사용

**매칭 게시글 검색**
- 카테고리에 따른 검색
- 제목 검색

**매칭 게시글 작성 및 조회**
- Daum 주소 API 사용하여 사용자 위치 지정
- KAKAO 지도 API 사용하여 사용자가 지정한 위치 표시

**실시간 채팅 기능**
- 웹소켓을 사용한 실시간 채팅 기능
- 매칭 게시글 상세 페이지에서 연락하기 버튼 클릭 → 새 채팅방 생성

**마이페이지**
- 작성한 글
- 문의내역
- 채팅내역
- 개인정보 수정
  
**공지 및 문의 게시판**

### ⚙️ 관리자
- 회원 및 게시글 관리
