
## 🔉 프로젝트 소개 


## 📱 아이고사장님~!

아이고 사장님~ 아이고 사장님~ 아이고 사장님~ 아이고 사장님~



## 👩🏻‍💻 팀원 소개

<table>
    <tr align="center">
              <td style="min-width: 200px;">
            <a href="https://github.com/hayounSong">
              <img src="https://github.com/hayounSong.png" width="100">
              <br />
              <b>송하윤 (hayounSong)</b>
            </a>
                       <br/>
              Server
        </td>
        <td style="min-width: 200px;">
            <a href="https://github.com/sss4920">
              <img src="https://github.com/sojungpp.png" width="100">
              <br />
              <b> 박소정 (sojungpp)</b>
            </a> 
            <br/>
       
 Server
    </tr>

</table>

협업 노션: [https://www.notion.so/go-sopt/CDS-TEAM_5-SERVER-cae33108857144779c36a0ae0be313fd?pvs=4](https://go-sopt.notion.site/7f4db09cda9f48be94f83314a9ac99da)

## 📱 프로젝트

### 🧐 
??

### 🍓 
??

### 💊 
?

### 🩺
?
<br />

![image](https://github.com/GOSOPT-CDS-TEAM-APP5/Server/assets/39684920/5738b936-98bf-4c01-90fa-dc707e93b700)

<hr/>
<br />


## 🛠 기술 스택


### 🖥 Backend

|역할|종류|
|-|-|
|Framework|<img alt="RED" src ="https://img.shields.io/badge/SPRING-6DB33F.svg?&style=for-the-badge&logo=Spring&logoColor=white"/> <img alt="RED" src ="https://img.shields.io/badge/SPRING Boot-6DB33F.svg?&style=for-the-badge&logo=SpringBoot&logoColor=white"/>|
|Database|<img alt="RED" src ="https://img.shields.io/badge/Mysql-003545.svg?&style=for-the-badge&logo=Mysql&logoColor=white"/>|
|Database Service|<img alt="RED" src ="https://img.shields.io/badge/Amazon Rds-527FFF.svg?&style=for-the-badge&logo=AmazonRds&logoColor=white"/>|
|Programming Language|<img alt="RED" src ="https://img.shields.io/badge/JAVA-004027.svg?&style=for-the-badge&logo=Jameson&logoColor=white"/>|
|API|![REST](https://img.shields.io/badge/Rest-4B3263?style=for-the-badge&logo=rest&logoColor=white)                                     
|Version Control|![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) |
|CI/CD|![Jenkins](https://img.shields.io/badge/Jenkins-%D24939.svg?style=for-the-badge&logo=Jenkins&logoColor=white)|
<br />


### 🖥 Common
|역할|종류|
|-|-|
|협업 관리|<img alt="RED" src ="https://img.shields.io/badge/Notion-000000.svg?&style=for-the-badge&logo=Notion&logoColor=white"/> |
|디자인|<img alt="RED" src ="https://img.shields.io/badge/Figma-F24E1E.svg?&style=for-the-badge&logo=Figma&logoColor=white"/>|

<br />


## 📂 폴더 구조
```

├── 📂.github

├── 📂 main
	├── 🗂️ resources
		├── 📕 application.yml


	├── 📂 controller(컨트롤러 파일)
		├── 🗂️ dto
		 ├──🗂️ request
		 ├──🗂️ response
			
	├── 📂 domain(엔티티 파일)

	├── 📂 repository(레포지토리 폴더)
	
	├── 📂 service(서비스 파일)
	
	├── 📂 exception(Exception enum, Exception class 파일)
		├── 🗂️ model
		
	├── 📂 common(공용 클래스 관리)
		├──🗂️ advice
		├──🗂️ dto
```
# Git Convention

---

> 1 Issue = 1 Branch = 1 PR
> 

## Commit

> `분류` : `작업 내역` - `#이슈 번호`
> 

예시 메시지: [feat] Movie Entity 구현

```swift
chore: 일반적인 수정 사항#2
feat: 새로운 주요 기능 추가 #2
add: 파일 추가, etc... #2
fix: 버그 수정 #2
del: 코드 및 파일 삭제 #2
ref: 코드 리팩토링 -> 결과는 똑같음. 근데 코드가 달라짐 #2
rename: 파일, 클래스, 변수명 등 이름 변경 #2
docs: Wiki, README 및 문서 파일 수정 #2
```

## Branch Naming

> `분류` /`이슈 번호-기능`
> 

예시 메시지: [feature/1-create-calender] 일정 등록

```swift
[feat/1-create-calender] 일정 등록
```

## Issue Naming

> `[분류]` 기능 정의
> 

예시 메시지: [Feat] 무비 엔티티 정의, [Feat] 무비차트 API 구현

## PR Convention

> `[분류]` 기능 정의
> 

이슈 네이밍 그대로 사용!

## 작업 순서

1. 이슈 생성
2. 브랜치 생성
3. 작업, 커밋
4. push
5. pr 작성
6. 코드리뷰
7. Approve 받았을 경우 셀프 merge
8. Delete Branch

# Code Convention

---

1. File Naming
- 파일 이름 및 클래스, 인터페이스 이름: **파스칼 케이스(Pascal Case)**

```java
public class ControllerExceptionAdvice {
```

1. Entity에서 사용되는 속성값들은 ? **카멜 케이스**(**camel Case)**

```java
private String email;
```

1. 내부에서 사용되는 함수 및 기타 사용: **카멜 케이스(camelCase)**

```java
public ApiResponse createEmail(@RequestBody @Valid final BoardRequestDto request) {
```

1. 엔티티 생성자 관리는 **Builder Pattern 사용**

```java
@Builder
```

### **인터페이스 이름에 명사/형용사 사용 [interface-noun-adj]**

인터페이스(interface)의 이름은 명사/명사절로 혹은 형용사/형용사절로 짓는다.

```java
// Good Exemples
public interface RowMapper {
public interface AutoClosable {
```

### **클래스 이름에 명사 사용 [class-noun]**

클래스 이름은 명사나 명사절로 짓는다.

### **메서드 이름은 동사/전치사로 시작 [method-verb-preposition]**

메서드명은 기본적으로 동사로 시작한다.

✔️ 다른 타입으로 전환하는 메서드나 빌더 패턴을 구현한 클래스의 메서드에서는 전치사를 쓸 수 있다.

```java
- 동사사용 : renderHtml()
- 전환메서드의 전치사 : toString()
```

### **상수는 대문자와 언더스코어로 구성[constant_uppercase]**

"static final"로 선언되어 있는 필드일 때 상수로 간주한다.

상수 이름은 대문자로 작성하며, 복합어는 언더스코어'_'를 사용하여 단어를 구분한다.

```java
public final int UNLIMITED = -1;
public final String POSTAL_CODE_EXPRESSION = “POST”;
```

### **변수**

### **변수에 소문자 카멜표기법 적용 [var-lower-camelcase]**

상수가 아닌 클래스의 멤버변수/지역변수/메서드 파라미터에는 소문자 카멜표기법(Lower camel case)을 사용한다.

```java
private boolean authorized;
private int accessToken;
```
