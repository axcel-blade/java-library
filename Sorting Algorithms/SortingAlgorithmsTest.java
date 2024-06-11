import java.util.*;
import java.io.*;

class SortingAlgorithms {
    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] numArray = {5, 2, 8, 1, 9};
        int[] sortedArray = {1, 2, 5, 8, 9};

        int[] tempArray = sortingAlgorithms.bubbleSort(numArray);
        assert Arrays.equals(sortedArray, tempArray) : "Test Failed";
        System.out.println("Test Passed");

    }

}