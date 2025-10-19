package model;

import java.util.regex.Pattern;

public class Calculator {
    public static int add(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }
        String numbers = input;
        String delimiter = "[,:]";

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\n");
            delimiter = Pattern.quote(String.valueOf(input.charAt(2)));
            numbers = input.substring(newlineIndex+1);
        }

        String[] tokens = numbers.split(delimiter);

        int sum = 0;
        for (String token : tokens) {
            sum += parsePositiveNumber(token);
        }

        return sum;
    }

    private static int parsePositiveNumber(String str) {
        try {
            int num = Integer.parseInt(str);
            if (num < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + num);
            }
            return num;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + str);
        }
    }
}
