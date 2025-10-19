package controller;

import model.Calculator;
import view.InputView;
import view.OutputView;

public class CalculatorController {
    public void run() {
        String input = InputView.readInput();
        int result = Calculator.add(input);
        OutputView.printResult(result);
    }
}
