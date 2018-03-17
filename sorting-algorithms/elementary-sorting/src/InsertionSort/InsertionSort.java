package InsertionSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please decide if the array is random or not: \n" +
                           "r - for randomize data \n" +
                            "i - to input 5 numbers \n");
        String enteredVal = in.nextLine();
        int[] data = new int[5];
        if(!enteredVal.equals("")) {
            switch (enteredVal) {
                case "r":
                    RandomArray(data);
                    break;
                case "i":
                    InputArray(data);
                    System.out.println("Array values : " + Arrays.toString(data));
                    break;
                default:
                    break;
            }
        }
    }

    private static void InputArray(int[] data) {
        for(int x=0;x <data.length; x++) {
            System.out.println("Please enter the value #" + x + ": ");
            String input = in.nextLine();
            data[x] = (!input.equals("") ? Integer.valueOf(input) : 0);
        }
        InsertionSortAlgo(data);
    }

    private static void RandomArray(int[] data) {
        for(int x = 0; x< data.length; x++) {
            data[x] = (int)Math.ceil(new Random().nextInt(50) + 1);
        }
        InsertionSortAlgo(data);
    }

    private static void InsertionSortAlgo(int[] data) {
        for(int x=0, j; x<data.length; x++) {
            int tmp = data[x];
            for(j=x; j>0 && tmp < data[j-1]; j--)
                data[j] = data[j-1];

            data[j] = tmp;
            System.out.println(j);
        }
        System.out.println("Sorted Array values : " + Arrays.toString(data));
    }
}
