package org.example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class App {
    public static void main(String[] args) {

        int numberDigits;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort?");
        numberDigits = scanner.nextInt();


        int[] numbers = new int[numberDigits];
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




