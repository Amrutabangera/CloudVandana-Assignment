package com.assignment;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	
    	public static void main(String[] args) {
        // initial array
        int[] initialArray = {1, 2, 3, 4, 5, 6, 7};

        Random random = new Random();
        for (int i = initialArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swapping elements at i and index
            int temp = initialArray[index];
            initialArray[index] = initialArray[i];
            initialArray[i] = temp;
        }

        // Printing the shuffled array
        System.out.println(Arrays.toString(initialArray));
    }
}

