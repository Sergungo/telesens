package ua.sgolenko.telesense.tasks4;

import java.util.Arrays;

public class SortBackAndNormal {

    static void showArray(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");

        }
        System.out.println();
    }

    static int[] changeOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
        }
        return arr;
    }

    static int[] changeOrderDesc(int[] arr) {
        for (int y = 0; y < arr.length; y++) {

            for (int i = 0; i < arr.length; i++) {
                int temp = 0;
                if (i + 1 <= arr.length - 1) {
                    if (arr[i] < arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        return arr;
    }


    static void sortFunc(int[] arr) {

        int temp[];
//    First 4 digits collecting and sorting
        temp = Arrays.copyOfRange(arr, 0, 4);
        changeOrder(temp);

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
//    Last 4 digits collecting
        temp = Arrays.copyOfRange(arr, arr.length - 4, arr.length);
        changeOrderDesc(temp);
        for (int i = 0; i < temp.length; i++) {
            arr[arr.length - temp.length + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + (int) (Math.random() * 20);
        }
        showArray(a);

        sortFunc(a);

        System.out.println();
        for (int x : a) {
            System.out.print(x + " ");
        }

    }

}
