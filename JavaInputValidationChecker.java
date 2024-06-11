/************************************************************************
 * Author - Srikanth Fernando                                           *
 * GitHub Username - axcel-blade                                        *
 * Title - Java Input Validation Checker                                *
 * Description - This Java code is for check if the user input is valid *
 * Created - 11/06/2024                                                 *
 * Last Modified - 11/06/2024                                           *
 ***********************************************************************/
public class JavaInputValidationChecker {
    /***********************************************************************************************************************************
     * Method - IntegerValidationChecker                                                                                               *
     * Import -                                                                                                                        *
     * Export -                                                                                                                        *
     * Description - This function check the user input is valid or not. If it is valid it will return the value or else it loop until *
     *                  the enter valid integer                                                                                        *
     ***********************************************************************************************************************************/
    public static int IntegerValidationChecker(String pPromptToUser) {
        Scanner userInput = new Scanner(System.in);
        int number;

        while (!userInput.hasNextInt()) {
            try {
                System.out.print(pPromptToUser);
                number = userInput.nextInt();

            } catch (InputMisMactch e) {
                System.out.println("Please enter a valid number");
                userInput.next(); // Clear the user input

            }

        }

    }

}