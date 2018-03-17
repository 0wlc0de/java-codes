package SelectionSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
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
        SelectionSortAlgo(data);
    }

    private static void SelectionSortAlgo(int[] data) {
        int x,y,l;
        for(x=0; x<data.length; x++) {
            for(y = x+1, l = x; y < data.length; y++) {
                if(data[y] < (data[l])) {
                    l = y;
                }
                if(x != l)
                    swapval(data, l, x);
            }
        }
        System.out.println("Sorted Array values : " + Arrays.toString(data));
    }

    private static void swapval(int[] data, int l, int x) {
        int tmp = data[l];
        data[l] = data[x];
        data[x] =  tmp;
    }

    private static void RandomArray(int[] data) {
        for(int x = 0; x < data.length; ++x) {
            data[x] = (int)Math.ceil((double)((new Random()).nextInt(50) + 1));
        }
        System.out.println("Array values : " + Arrays.toString(data));
        SelectionSortAlgo(data);
    }
}
