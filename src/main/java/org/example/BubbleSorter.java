package org.example;
import java.util.Arrays;

public class BubbleSorter {

    Integer[] outputArray = {6,5,4,3,2,1};

    public static void bubbleSorter(int[] outputArray) {
        int counter = 0;


        while ((outputArray[0] > outputArray[1]) || (outputArray[1] > outputArray[2]) || (outputArray[2] > outputArray[3]) || (outputArray[3] > outputArray[4]) || (outputArray[4] > outputArray[5])) {

            //loop through and swap digits
            //System.out.println(Arrays.toString(outputArray));
            for (int element = 0; element < outputArray.length -1; element++ ) {
                if (outputArray[element] > outputArray[element +1]) {
                    int oldElement = outputArray[element];
                    int newElement = outputArray[element+1];
                    outputArray[element] = newElement;
                    outputArray[element +1] = oldElement;
                    //System.out.println(Arrays.asList(outputArray));

                }
                else {
                    //System.out.println(Arrays.asList(outputArray));
                }
            }
            //counter++;
            //System.out.println("Pass " + counter + " complete");
        }
        System.out.println(" BubbleSorter - " + Arrays.toString(outputArray));
    }
}

