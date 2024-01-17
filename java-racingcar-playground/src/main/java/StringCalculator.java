public class StringCalculator {

    private final StringParser stringParser = new StringParser();

    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        return stringParser.parse(input);
    }
}
