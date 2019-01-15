package ua.sgolenko.telesens.tasks6_1;

public class FuncMin {

    static double minimum;

    static double func(double x) {
        return x * x * x;
    }


    public static double printMin(double from, double to,
                                  double step, Function min) {
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
