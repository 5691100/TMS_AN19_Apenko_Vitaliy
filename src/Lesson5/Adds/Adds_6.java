package Lesson5.Adds;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array's elements: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        int[] arrayCheck = new int[number];
        int[] arrayMax = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Initial array: " + Arrays.toString(array));

        int sumMax = array[0];
        arrayMax[0] = array[0];
        int i = 0;
        int maxCounter = 1;
        while (i < number - 1) {
            int counter = 0;
            arrayCheck[counter] = array[i];
            int sumCheck = array[i];
            int j = i;
            while (array[j + 1] >= array[j]) {
                counter++;
                sumCheck += array[j + 1];
                arrayCheck[counter] = array[j + 1];
                if (j != number - 2) {
                    j++;
                } else {
                    break;
                }
            }
            if (sumCheck > sumMax) {
                for (int k = 0; k < counter + 1; k++) {
                    arrayMax[k] = arrayCheck[k];
                    arrayCheck[k] = 0;
                }
                maxCounter = counter + 1;
                sumMax = sumCheck;
            } else {
                for (int k = 0; k < counter + 1; k++) {
                    arrayCheck[k] = 0;
                }
            }
            i += counter + 1;
        }

        int[] arrayFinal = new int[maxCounter];

        System.arraycopy(arrayMax, 0, arrayFinal, 0, maxCounter);
        System.out.println("Max sequence: " + Arrays.toString(arrayFinal));
        System.out.println(maxCounter);
    }
}
