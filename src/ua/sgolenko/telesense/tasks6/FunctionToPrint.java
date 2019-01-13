package ua.sgolenko.telesense.tasks6;

public interface FunctionToPrint {
    double f(double x);

    default void print(double x) {
        System.out.printf("x = %7f f(x) = %7f%n", x, f(x));
    }
}