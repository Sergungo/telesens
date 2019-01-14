package ua.sgolenko.telesens.tasks4;

import java.util.Scanner;

public class _test {

    private static int f(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(f(i) + " ");
        }
    }
}
