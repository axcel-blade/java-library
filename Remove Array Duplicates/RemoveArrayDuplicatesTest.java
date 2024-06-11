import java.util.*;

class RemoveArrayDuplicatesTest {
    public static void main(String[] args) {
        RemoveArrayDuplicates removeArrayDuplicates = new RemoveArrayDuplicates();

        removeIntegerArrayDuplicatesTest(removeArrayDuplicates);

        removeStringArrayDuplicatesTest(removeArrayDuplicates);
    }

    public static void removeIntegerArrayDuplicatesTest(RemoveArrayDuplicates pRemoveArrayDuplicates) {
        int[] numArray = {1, 2, 2, 3, 4, 4 , 5};
        int[] expectedArray = {1, 2, 3, 4, 5};

        int[] tempArray = pRemoveArrayDuplicates.removeIntegerArrayDuplicates(numArray);
        assert Arrays.equals(expectedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");
    }

    public static void removeStringArrayDuplicatesTest(RemoveArrayDuplicates pRemoveArrayDuplicates) {
        String[] stringArray = {"Apple", "Banana", "Banana", "Grapes", "Pineapple", "Pineapple", "Watermelon"};
        String[] expectedArray = {"Apple", "Banana", "Grapes", "Pineapple", "Watermelon"};

        String[] tempArray = pRemoveArrayDuplicates.removeStringArrayDuplicates(stringArray);
        assert Arrays.equals(expectedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");
    }
}