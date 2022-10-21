package org.example;
import java.util.Arrays;

public class MergeSorter {

    int[] inputArray = {6,5,4,3,2,1};

    public static void mergeSorter(int[] inputArray) {

            //printArray(inputArray);
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

            mergeSorter(left);
            mergeSorter(right);

            merge(inputArray, left, right);

            printArray(inputArray);
    }

        private static void merge ( int[] inputArray, int[] left, int[] right){
            int leftSize = left.length;
            int rightSize = right.length;

            int i=0;
            int j=0;
            int k=0;

            while (i < leftSize && j < rightSize) {
                if (left[i] <= right[j]) {
                    inputArray[k] = left[i];
                    i++;
                }
                else {
                    inputArray[k] = right[j];
                    j++;
                }
                k++;
            }

            while (i < leftSize) {
                inputArray[k] = left[i];
                i++;
                k++;
            }

            while (j < rightSize) {
                inputArray[k] = right[j];
                j++;
                k++;
            }

        }

        public static void printArray (int[] inputArray) {
            System.out.println(Arrays.toString(inputArray));
        }
}
