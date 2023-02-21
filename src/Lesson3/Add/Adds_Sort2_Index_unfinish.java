package Lesson3.Add;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_Sort2_Index_unfinish {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in Array One:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the number of elements in Array One:");
        int number2 = sc.nextInt();
        int[] array1 = new int[number1];
        for (int i = 0; i < number1; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        int[] array2 = new int[number2];
        for (int i = 0; i < number2; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array One: " + Arrays.toString(array1));
        System.out.println("Array Two: " + Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("Array One New: " + Arrays.toString(array1));
        System.out.println("Array Two New: " + Arrays.toString(array2));
        int[] array3 = new int[number1 + number2];
        int i = 0;
        int minMin = Integer.MAX_VALUE;
        int counter1 = 0;
        int counter2 = 0;
        while (i < number1 + number2) {
            if (array2[counter2] >= array1[counter1]) {
                    minMin = array1[counter1];
                    if (counter1 != number1 - 1) {
                        counter1++;
                    }
                } else {
                    minMin = array2[counter2];
                    if (counter2 != number2 - 1) {
                        counter2++;
                    }
                }
            array3[i] = minMin;
            i++;
        }
        System.out.println("Array Merged: " + Arrays.toString(array3));
    }
}
