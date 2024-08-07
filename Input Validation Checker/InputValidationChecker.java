/************************************************************************
 * Author - Srikanth Fernando                                           *
 * Title - Input Validation Checker                                     *
 * Description - This Java code is for check if the user input is valid *
 * Created - 11/06/2024                                                 *
 * Last Modified - 07/08/2024                                           *
 ***********************************************************************/
import java.util.*;

public class InputValidationChecker 
{
    /***********************************************************************************************************************************
     * Method - IntegerValidationChecker                                                                                               *
     * Import - pScanner (Scanner), pPromptToUser (String)                                                                                                 *
     * Export - number (Integer)                                                                                                       *
     * Description - This function check the user input is valid or not. If it is valid it will return the value or else it loop until *
     *                  the enter valid integer                                                                                        *
     ***********************************************************************************************************************************/
    public static int integerValidationChecker(Scanner pScanner, String pPromptToUser) 
    {
        int number = 0;
        boolean isNotValid = true;

        do 
        {
            try 
            {
                System.out.print(pPromptToUser);
                String userInput = pScanner.nextLine();
                
                if (userInput.isEmpty()) 
                {
                    throw new NoSuchElementException();
                } else 
                {
                    number = Integer.parseInt(userInput);
                }

                isNotValid = false;

            } catch (InputMismatchException e) 
            {
                System.out.println("\nERROR: Please enter a number.\n");
                //scanner.next(); // Clear the user input

            } catch (NoSuchElementException e) 
            {
                System.out.println("\nERROR: Do not leave the field empty.\n");
                //scanner.next(); // Clear the user input

            } catch (NumberFormatException e) 
            {
                System.out.println("\nERROR: Please enter a number.\n");
                //scanner.next(); // Clear the user input
            }

        } while (isNotValid);

        return number;
    }
}