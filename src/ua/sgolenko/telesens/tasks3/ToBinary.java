package ua.sgolenko.telesens.tasks3;

import java.util.Scanner;

public class ToBinary {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        String byt = "";
        for (int i = 7; i >= 0; i--) {

            System.out.print((byte) (1 & (b >> i)));
            byt += String.valueOf((byte) (1 & (b >> i)));
        }
        System.out.println();

        int res = Integer.parseInt(byt);
        System.out.println(Math.abs(res));

    }
}
