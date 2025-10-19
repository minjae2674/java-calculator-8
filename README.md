# java-calculator-precourse

## 시작
모델(M)   
입출력 받는 부분을 따로 구현(V)   
컨트롤러(C)    

# 문자열 덧셈 계산기

## 🚀 기능 요구 사항
입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현한다.

---

## ✅ 구현할 기능 목록
-기초 공사 전체 구조  
-계산 기능 빼고 간단한 것들 구현  
-메인기능 Calculator 구현  

- [ ] 빈 문자열("") 입력 시 0을 반환한다.
- [ ] 쉼표(,) 또는 콜론(:)을 구분자로 사용하는 문자열의 숫자 합을 반환한다.
- [ ] 커스텀 구분자("//;\n1;2;3")를 지정할 수 있다.
- [ ] 숫자가 아닌 값이 입력되면 `IllegalArgumentException`을 발생시킨다.
- [ ] 음수가 입력되면 `IllegalArgumentException`을 발생시킨다.
- [ ] 최종 결과를 출력한다.

## 📂 프로젝트 구조 (MVC 패턴)
## 📂 프로젝트 구조

````markdown
src/
 └── calculator/
     ├── Application.java           ← main() (프로그램 시작)
     ├── controller/
     │    └── CalculatorController.java
     ├── model/
     │    └── Calculator.java
     └── view/
          ├── InputView.java
          └── OutputView.java
````