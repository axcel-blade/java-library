import java.util.*;
import java.io.*;

class SortingAlgorithmsTest {
    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] numArray = {5, 2, 8, 1, 9};
        int[] expectedSortedArray = {1, 2, 5, 8, 9};

        bubbleSortTest(sortingAlgorithms, numArray, expectedSortedArray);
        selectionSortTest(sortingAlgorithms, numArray, expectedSortedArray);
        insertionSortTest(sortingAlgorithms, numArray, expectedSortedArray);

    }

    public static void bubbleSortTest(SortingAlgorithms pSortingAlgorithms, int[] pNumArray, int[] pExpectedSortedArray) {
        int[] tempArray = pSortingAlgorithms.bubbleSort(pNumArray);
        assert Arrays.equals(pExpectedSortedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");

    }

    public static void selectionSortTest(SortingAlgorithms pSortingAlgorithms, int[] pNumArray, int[] pExpectedSortedArray) {
        int[] tempArray = pSortingAlgorithms.bubbleSort(pNumArray);
        assert Arrays.equals(pExpectedSortedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");

    }

    public static void insertionSortTest(SortingAlgorithms pSortingAlgorithms, int[] pNumArray, int[] pExpectedSortedArray) {
        int[] tempArray = pSortingAlgorithms.bubbleSort(pNumArray);
        assert Arrays.equals(pExpectedSortedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");

    }

}