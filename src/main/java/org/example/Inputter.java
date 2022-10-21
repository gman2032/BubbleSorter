package org.example;
import java.util.Scanner;
import java.util.Random;

public class Inputter {

    int[] numbers = new int[6];

   public static int numbersGetter (int numberDigits) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("How many numbers do you want to sort?");
       numberDigits = scanner.nextInt();
       return numberDigits;
   }


    public static int[] Randomizer(int[] numbers) {



        {
            Random rand = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(10000);

            }
        }
        System.out.println(numbers);
        return numbers;
    }
}


 /*   private static Integer[] Inputter() {
        Scanner scanner = new Scanner(System.in);

        int firstNum;
        int secondNum;
        int thirdNum;
        int fourthNum;
        int fifthNum;
        int sixthNum;

        System.out.println("Enter 1st number: ");
        firstNum = scanner.nextInt();

        System.out.println("Enter 2nd number: ");
        secondNum = scanner.nextInt();

        System.out.println("Enter 3rd number: ");
        thirdNum = scanner.nextInt();

        System.out.println("Enter 4th number: ");
        fourthNum = scanner.nextInt();

        System.out.println("Enter 5th number: ");
        fifthNum = scanner.nextInt();

        System.out.println("Enter 6th number: ");
        sixthNum = scanner.nextInt();

        Integer[] inputArray = {firstNum, secondNum, thirdNum, fourthNum, fifthNum, sixthNum};
        Integer[] outputArray = inputArray;


        scanner.close();
        return outputArray;
    }

    */

