import java.util.*;

class RemoveArrayDuplicatesTest {
    public static void main(String[] args) {
        RemoveArrayDuplicates removeArrayDuplicates = new RemoveArrayDuplicates();
        int[] numArray = {1, 2, 2, 3, 4, 4 , 5};
        int[] expectedArray = {1, 2, 3, 4, 5};

        removeIntegerArrayDuplicatesTest(removeArrayDuplicates, numArray, expectedArray);
    }

    public static void removeIntegerArrayDuplicatesTest(RemoveArrayDuplicates pRemoveArrayDuplicates, int[] pNumArray, int[] pExpectedArray) {
        int[] tempArray = pRemoveArrayDuplicates.removeIntegerArrayDuplicates(pNumArray);
        assert Arrays.equals(pExpectedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");
    }
}