/************************************************************************
 * Author - Srikanth Fernando                                           *
 * GitHub Username - axcel-blade                                        *
 * Title - Sorting Algorithms                                           *
 * Description - This Java code is for sort out list using algorithms   *
 * Created - 11/06/2024                                                 *
 * Last Modified - 11/06/2024                                           *
 ***********************************************************************/
public class SortingAlgorithms {
    /*****************************************************************************************
     * Method - bubbleSort                                                                   *
     * Import - arrayData[] (Integer)                                                        *
     * Export - arrayData[] (Integer)                                                        *
     * Description - This function is sort the array in ascending order and return the array *
     ****************************************************************************************/
    public static int[] bubbleSort(int[] arrayData) {
        int arrayLength = arrayData.length;
        boolean swapped;

        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;

            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (arrayData[j] > arrayData[j + 1]) {
                    int temp = arrayData[j];
                    arrayData[j] = arrayData[j + 1];
                    arrayData[j + 1] = temp;
                    swapped = true;

                }

            }
            if (!swapped) {
                break;
            }

        }
        return arrayData;

    }

    /*****************************************************************************************
     * Method - selectionSort                                                                *
     * Import - arrayData[] (Integer)                                                        *
     * Export - arrayData[] (Integer)                                                        *
     * Description - This function is sort the array in ascending order and return the array *
     ****************************************************************************************/
    public static int[] selectionSort(int[] arrayData) {
        int arrayLength = arrayData.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrayLength; j++) {
                if (arrayData[j] < arrayData[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = arrayData[minIndex];
            arrayData[minIndex] = arrayData[i];
            arrayData[i] = temp;

        }
        return arrayData;

    }

    /*****************************************************************************************
     * Method - insertionSort                                                                *
     * Import - arrayData[] (Integer)                                                        *
     * Export - arrayData[] (Integer)                                                        *
     * Description - This function is sort the array in ascending order and return the array *
     ****************************************************************************************/
    public static int[] insertionSort(int[] arrayData) {
        int arrayLength = arrayData.length;

        for (int i = 1; i < arrayLength; ++i) {
            int temp = arrayData[i];
            int j = i - 1;

            while (j >= 0 && arrayData[j] > temp) {
                arrayData[j + 1] = arrayData[j];
                j = j - 1;

            }
            arrayData[j + 1] = temp;

        }
        return arrayData;

    }

}