package calculator;

import calculator.view.InputView;
import calculator.view.OutputView;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //계산기 가져오기

        String str = InputView.inputView();
        int result = calculator.run(str); // 계산기 실행

        OutputView.outputView(result); //계산 값 출력
    }


}
