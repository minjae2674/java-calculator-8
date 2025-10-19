package calculator;

import calculate.Operation;
import calculate.Plus;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    Operation calculator = new Plus();


    public static void main(String[] args) {
        String str = Console.readLine();
        String result = calculator.run(str);
        System.out.println(result);
    }

    static void run(String str) {
        calculator.result(str);
    }

}
