package InsertionSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    private static Scanner in;

    public InsertionSort() {
    }

    public static void main(String[] args) {
        System.out.println("Please decide if the array is random or not: \nr - for randomize data \ni - to input 5 numbers \n");
        String enteredVal = in.nextLine();
        int[] data = new int[5];
        if (!enteredVal.equals("")) {
            byte var4 = -1;
            switch(enteredVal.hashCode()) {
                case 105:
                    if (enteredVal.equals("i")) {
                        var4 = 1;
                    }
                    break;
                case 114:
                    if (enteredVal.equals("r")) {
                        var4 = 0;
                    }
            }

            switch(var4) {
                case 0:
                    RandomArray(data);
                    break;
                case 1:
                    InputArray(data);
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
        InsertionSortAlgo(data);
    }

    private static void RandomArray(int[] data) {
        for(int x = 0; x < data.length; ++x) {
            data[x] = (int)Math.ceil((double)((new Random()).nextInt(50) + 1));
        }
        System.out.println("Array values : " + Arrays.toString(data));
        InsertionSortAlgo(data);
    }

    private static void InsertionSortAlgo(int[] data) {
        for(int x = 0; x < data.length; ++x) {
            int tmp = data[x];

            int j;
            for(j = x; j > 0 && tmp < data[j - 1]; --j) {
                data[j] = data[j - 1];
            }

            data[j] = tmp;
        }

        System.out.println("Sorted Array values : " + Arrays.toString(data));
    }

    static {
        in = new Scanner(System.in);
    }
}
