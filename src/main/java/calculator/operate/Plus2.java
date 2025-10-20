package calculator.operate;

public class Plus2 implements Operation{

    @Override
    public int calculate(String input) throws IllegalArgumentException {
        if (input.isEmpty()) {
            return 0;
        }
        if (input.contains(",") | input.contains(":")) {
            return normal(input);
        }
        if (input.startsWith("//") && input.contains("\\n")) {
            return custom(input);
        } else {
            throw new IllegalArgumentException();
        }
    }
    public int custom(String input) {
        int start = 2;
        int finish = input.indexOf("\\n");
        String custom = input.substring(start, finish);
        String customTarget = input.substring(finish + 2);
        String[] str = customTarget.split(custom);
        int sum = 0;
        for (String num : str) {
            if (Integer.parseInt(num) < 0) {
                throw new IllegalArgumentException();
            }
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public int normal(String input) {
        String[] str = input.split(",|:");
        int sum = 0;
        for (String num : str) {
            if (Integer.parseInt(num) < 0) {
                throw new IllegalArgumentException();
            }
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
