package org.example;

import java.util.Arrays;
import java.util.Random;


public class App {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        {
            Random rand = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(100);
            }
        }

        System.out.println("Before Sorting - " + Arrays.toString(numbers));

        BubbleSorter.bubbleSorter(numbers);
        MergeSorter.mergeSorter(numbers);



    }
}




