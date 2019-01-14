package ua.sgolenko.telesens.tasks3;

import java.util.Scanner;

public class Fibonachi {

    private static int fiboRec(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return fiboRec(index - 1) + fiboRec(index - 2);
        }
    }

    private static void fiboCycle (int index) {

        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < index) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fiboRec(i) + " ");
        }
        System.out.println();
        fiboCycle(n);
    }
}
