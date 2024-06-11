import java.util.*;
import java.io.*;

class SortingAlgorithms {
    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] numArray = {5, 2, 8, 1, 9};
        int[] sortedArray = {1, 2, 5, 8, 9};

        bubbleSortTest(sortingAlgorithms, numArray, sortedArray);

    }

    public static void bubbleSortTest(SortingAlgorithms pSortingAlgorithms, int[] pNumArray, int[] pSortedArray) {
        int[] tempArray = pSortingAlgorithms.bubbleSort(pNumArray);
        assert Arrays.equals(pSortedArray, tempArray) : "Test Failed";
    }
}