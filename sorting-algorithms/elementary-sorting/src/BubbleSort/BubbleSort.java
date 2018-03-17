package BubbleSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please decide if the array is random or not: \nr - for randomize data \ni - to input 5 numbers \n");
        String enteredVal = in.nextLine();
        int[] data = new int[5];
        if (!enteredVal.equals("")) {
            switch(enteredVal) {
                case "r":
                    RandomArray(data);
                    break;
                case "i":
                    InputArray(data);
                    break;
                default:
                    break;

            }

        }

    }

    private static void InputArray(int[] data) {
        for(int x = 0; x < data.length; ++x) {
            System.out.println("Please enter the value #" + x + ": ");
            int input = in.nextInt();
            data[x] =  input;
        }
        System.out.println("Array values : " + Arrays.toString(data));
        BubbleSortAlgo(data);
    }

    private static void RandomArray(int[] data) {
        for(int x = 0; x < data.length; ++x) {
            data[x] = (int)Math.ceil((double)((new Random()).nextInt(50) + 1));
        }
        System.out.println("Array values : " + Arrays.toString(data));
        BubbleSortAlgo(data);
    }

    private static void BubbleSortAlgo(int[] data) {
        for(int x=0; x< data.length; x++) {
            for(int y=data.length-1; y > x; y--) {
                if(data[y] < data[y-1])
                    swapval(data, y, y-1);
            }
        }
        System.out.println("Sorted Array values : " + Arrays.toString(data));
    }

    private static void swapval(int[] data, int l, int x) {
        int tmp = data[l];
        data[l] = data[x];
        data[x] =  tmp;
    }
}
