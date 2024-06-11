import java.io.*;

public class InputValidationCheckerTest {
    public static void main(String[] args) {
        InputValidationChecker validationChecker = new InputValidationChecker();
        isValidInteger(validationChecker);
        System.out.println();
        isNotValidInteger(validationChecker);
    }

    public static void isValidInteger(InputValidationChecker pValidationChecker) {
        String userInput = "10";

        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        assert 10 == pValidationChecker.integerValidationChecker("Enter a number: ") : "Test Failed.";
    }

    public static void isNotValidInteger(InputValidationChecker pValidationChecker) {
        String userInput = "Tenet";

        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        assert 10 == pValidationChecker.integerValidationChecker("Enter a number: ") : "Test Failed.";
    }
}