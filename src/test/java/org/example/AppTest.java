package org.example;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;


public class AppTest 
{


    @Test
    @DisplayName("BubbleSorter Works")
    void CheckBubbleSorterWorks () {
        Assertions.assertArrayEquals("[1,2,3,4,5,6]",BubbleSorter.bubbleSorter(654321);
    }
}
