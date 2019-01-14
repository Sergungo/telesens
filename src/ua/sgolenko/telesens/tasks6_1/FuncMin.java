package ua.sgolenko.telesens.tasks6_1;

public class FuncMin {

    static double minimum;


    public double a(double x, double y) {
        return x < y ? x : y;
    }

    static double func(double x) {
        return x * x * x;
    }


    public static double printMin(double from, double to,
                                  double step, MinValue min) {
        for (double x = from; x <= to; x += step) {
            if (x == from) {
                minimum = func(x);
            } else {
                minimum = min.a(minimum, func(x));
            }
        }
        return minimum;
    }
}
