public class StringValidation {

    public void validate(String number) {
        if (!number.matches("-?\\d+")) {
            throw new RuntimeException("Invalid input: " + number);
        }
        if (Integer.parseInt(number) < 0) {
            throw new RuntimeException("Negatives not allowed: " + number);
        }
    }
}
