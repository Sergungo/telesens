package ua.sgolenko.telesense.tasks6;

public class FuncMin {

    static double minimum;


    static double func(double x) {
        return x * x * x;
    }

    static void printMin(double from, double to,
                         double step, MinValue min) {

        for (double x = from; x <= to; x += step) {
            if (x == from) {
                minimum = func(x);
            } else {
                minimum = min.a(minimum, func(x));

                System.out.printf("x = %7f, func(x) = %7f, a(x) = %7f%n", x, func(x), min.a(minimum, func(x)));

            }
        }
        System.out.print("Minimal function value: " + minimum);
        System.out.println();
    }

    // В функции main() создаем объект безымянного класса:
    public static void main(String[] args) {

        System.out.println("Noname class approach: ");
        printMin(-2, 2, 0.5, new MinValue() {
            @Override
            public double a(double x, double y) {
                return x < y ? x : y;
            }
        });
        System.out.println();

        System.out.println("Lambda approach: ");
        printMin(-2, 2, 0.5, (x, y) -> {
            return x < y ? x : y;
        });

        FuncMin tmp = new FuncMin();


    }


}
