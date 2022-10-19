package org.example;
import java.util.Arrays;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {


        //Input 6 random digits to create int Array
        Integer[] outputArray = Inputter();


        //Check if array is ordered
        BubbleSort(outputArray);
    }

    private static Integer[] Inputter() {
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

    private static void BubbleSort(Integer[] outputArray) {
        int counter = 0;

        while ((outputArray[0] > outputArray[1]) || (outputArray[1] > outputArray[2]) || (outputArray[2] > outputArray[3]) || (outputArray[3] > outputArray[4]) || (outputArray[4] > outputArray[5])) {

            //loop through and swap digits
            System.out.println(Arrays.asList(outputArray));
            for (int element = 0; element < outputArray.length -1; element++ ) {
                if (outputArray[element] > outputArray[element +1]) {
                    int oldElement = outputArray[element];
                    int newElement = outputArray[element+1];
                    outputArray[element] = newElement;
                    outputArray[element +1] = oldElement;
                    System.out.println(Arrays.asList(outputArray));

                }
                else {
                    System.out.println(Arrays.asList(outputArray));
                }
            }
            counter++;
            System.out.println("Pass " + counter + " complete");
        }
        System.out.println("Completed");
    }
}
