import java.io.*;

public class InputValidationCheckerTest {
    public static void main(String[] args) {
        InputValidationChecker validationChecker = new InputValidationChecker();

        emptyInteger(validationChecker);
        System.out.println("Test Passed");

        isValidInteger(validationChecker);
        System.out.println("Test Passed");

        isNotValidInteger(validationChecker);
        System.out.println("Test Passed");

    }

    public static void emptyInteger(InputValidationChecker pValidationChecker) {
        String userInput = "";

        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        assert 10 == pValidationChecker.integerValidationChecker("Enter a number: ") : "Test Failed.";
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