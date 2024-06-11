/************************************************************************
 * Author - Srikanth Fernando                                           *
 * GitHub Username - axcel-blade                                        *
 * Title - Remove Array Duplicates                                      *
 * Description - This Java code is for remove duplicates in an array    *
 * Created - 11/06/2024                                                 *
 * Last Modified - 11/06/2024                                           *
 ***********************************************************************/
public class RemoveArrayDuplicates {
    /*****************************************************************************************
     * Method - removeIntegerArrayDuplicates                                                 *
     * Import - pArray[] (Integer)                                                           *
     * Export - uniqueArray[] (Integer)                                                      *
     * Description - This function is remove duplicates in an integer array                  *
     ****************************************************************************************/
    public static int[] removeIntegerArrayDuplicates(int[] pArray) {
        int[] passedArray = pArray;
        // Create a temporary array to hold unique elements.
        int passedArrayLength = passedArray.length;
        int[] tempArray = new int[passedArrayLength];
        int j = 0;
    
        // Copy unique elements to the temporary array.
        for (int i = 0; i < passedArrayLength - 1; i++) {
            if (passedArray[i] != passedArray[i + 1]) {
                tempArray[j++] = passedArray[i];
            }
        }
    
        // Add the last element as it is always unique.
        tempArray[j++] = passedArray[passedArrayLength - 1];
    
        // Copy the unique elements back to the original array.
        int[] uniqueArray = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = tempArray[i];
        }

        return uniqueArray;
    }
}