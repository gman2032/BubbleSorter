package org.example;
import jdk.internal.ref.CleanerFactory;

import java.util.Random;


public class MergeSorter {

    Random rand = new Random();
    int[] numbers = new int[6];

    for (int i=0; i < numbers.length; i++) {
        numbers[i] = rand.nextInt(10000);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] left = new int[midIndex];
        int[] right = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            left[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            right[i - midIndex] = inputArray[i];
        }

        mergeSort(left);
        mergeSort(right);

    }

    private static void merge (int[] inputArray, int[] left, int[] right)
        int leftSize = left.length


}
