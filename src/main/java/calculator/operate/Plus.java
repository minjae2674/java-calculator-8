package calculator.operate;

public class Plus implements Operation{

    @Override
    public int calculate(String input) throws IllegalArgumentException {
        if (input.isEmpty()) {
            return 0;
        } else if (input.contains(",") | input.contains(":")) {
            String[] str = input.split(",|:");
            int sum = 0;
            for (String num : str) {
                if (Integer.parseInt(num) < 0) {
                    throw new IllegalArgumentException();
                }
                sum += Integer.parseInt(num);
            }
            return sum;
        } else if (input.startsWith("//") && input.contains("\\n")) {
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
        } else {
            throw new IllegalArgumentException();
        }
    }
}
