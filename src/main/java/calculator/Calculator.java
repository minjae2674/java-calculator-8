package calculator;

import calculator.operate.Operation;
import calculator.operate.Plus;
import calculator.operate.Plus2;

public class Calculator {
    Operation calculator = new Plus2();

    public int run(String str) {
        return calculator.calculate(str);
    }
}
