package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //계산기 가져오기

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String str = Console.readLine(); //계산기에 입력값 넣기
        int result = calculator.run(str); // 계산기 실행

        System.out.println("결과 : " + result); //계산 값 출력
    }


}
