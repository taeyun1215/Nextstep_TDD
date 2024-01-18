package stringCalculator;

import java.util.Arrays;

public class StringParser {

    private final StringValidation stringValidation = new StringValidation();
    private static final String DEFAULT_DELIMITER = ",|:";

    public int parse(String input) {
        String[] tokens = input.split(DEFAULT_DELIMITER);
        return Arrays.stream(tokens)
                .mapToInt(this::convertToInt)
                .sum();
    }

    private int convertToInt(String number) {
        stringValidation.validate(number.trim());
        return Integer.parseInt(number);
    }

}
