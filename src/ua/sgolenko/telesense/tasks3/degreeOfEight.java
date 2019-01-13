package ua.sgolenko.telesense.tasks3;

import java.util.Scanner;

public class degreeOfEight {

    static void power(int a) {

        System.out.println("Arithmetic approach:");
        final int start = 8;
        int power = 1;
        for (int i = 0; i <= a; i++) {
            System.out.printf("8 ^%2d = %d\n", i, power);
            power *= start;
        }
    }


    static void powerByte(byte b) {
        System.out.println("Byte approach:");
        final int start = 8;
        int result = start;
        for (int i = 0; i <= b * 3; ) {
            System.out.printf("2 ^ %2d = %d\n", i, 1 << i);
            i = i + 3;

        }
    }


    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a digit from 0 to 10:");

            while (true) {

                String in = input.nextLine();

                if (in.matches("[0-9]")) {
                    int powNum = Integer.parseInt(in);

                    if (powNum >= 0 && powNum <= 10) {

                        power(powNum);
                        powerByte((byte) powNum);
                        input.close();
                        break;

                    }
                } else System.out.println("Please enter correct value!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
