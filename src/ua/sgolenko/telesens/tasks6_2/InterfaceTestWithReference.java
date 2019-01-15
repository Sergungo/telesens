package ua.sgolenko.telesens.tasks6_2;

import ua.sgolenko.telesens.tasks6_1.FuncMin;

import java.util.function.DoubleBinaryOperator;

public class InterfaceTestWithReference implements DoubleBinaryOperator {

    @Override
    public double applyAsDouble(double x, double y) {
        return x < y ? x : y;
    }


    public static void main(String[] args) {
        System.out.println("Method reference approach: ");

        InterfaceTestWithReference tmp = new InterfaceTestWithReference();
        System.out.println(FuncMin.printMin(-2, 2, 0.5, tmp::applyAsDouble));

    }


}
