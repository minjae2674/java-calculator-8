package calculator;

import calculator.operate.Operation;
import calculator.operate.Plus;

public class Calculator {
    Operation calculator = new Plus();

    public int run(String str) {
        return calculator.calculate(str);
    }
}
