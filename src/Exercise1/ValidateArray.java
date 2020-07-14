package Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateArray {

    /**
     * the method gets the index of the item of the given array
     * @param arr integer array
     * @param value the value that needs to be found out
     * @return returns -1, if index exceeds the array capacity
     */

    public static int findValue(int[] arr, int value) {
        int index = 0;
        while (index <= arr.length) {
            if (arr[index] == value) {
                return index;
            } else {
                index += 1;
            }
        }
        return -1;
    }

    /**
     * method finds the smallest value in the array
     * @param arr integer array
     * @return  returns the value of the item located at the index {0}
     */
    public static int smallestVal(int[] arr) {
        //sorts the array
        Arrays.sort(arr);
        return arr[0];
    }

    /**
     * method finds the smallest value in the array
     * @param arr integer array
     * @return  returns the value of the item located at the last index
     */
    public static int largestVal(int[] arr) {
        Arrays.sort(arr);
        return arr[(arr.length) - 1];
    }

    public static void main(String[] args) {
        // variables
        int[] arr = {12, 23, 67, 46, 56, 89, 24, 34, 4, 78};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to get the index of");
        int i = sc.nextInt();

        try {
            int result = findValue(arr, i);
            System.out.println(" The index of " + i + " is: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println(" Odd values in the array are:");
        for (int odd : arr) {
            if (odd % 2 != 0) {
                System.out.print(" " + odd);
            }
        }

        System.out.println("\n Even values in the array are:");
        for (int even : arr) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
            }
        }

        System.out.println("\n Smallest value in the array is : " + smallestVal(arr));

        System.out.println("\n Largest value in the array is: " + largestVal(arr));

    }
}
