package ua.sgolenko.telesens.tasks4;

public class SumOfPositive {

    static double sumRec(double[] a, int b) {
        if (b <= 0) {
            return 0;
        }
        b--;
        if (a[b] < 0) {
            return 0 + sumRec(a, b);
        } else
            return a[b] + sumRec(a, b);
    }

    static double sumRec(double[] a) {

        return sumRec(a, a.length);
    }

    static double sumCycle(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        double arr[] = {1, 2, 1, -5.5, 2.5, 1};

        System.out.println("Result of cycle approach: " + sumCycle(arr));
        System.out.println();
        System.out.println("Result of recursion approach: " + sumRec(arr));
    }
}
