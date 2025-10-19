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


    }
}
