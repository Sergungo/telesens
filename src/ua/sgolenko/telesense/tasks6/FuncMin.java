package ua.sgolenko.telesense.tasks6;

public class FuncMin {

    static void printTable(double from, double to,
                           double step, FunctionToPrint func) {
        for (double x = from; x <= to; x += step) {
            func.print(x);
        }
        System.out.println();
    }

    void print(double x) {
        System.out.printf("x = %7f f(x) = %7f%n", x, x * x * x);
    }

    static void printMin(double from, double to,
                         double step, MinValue min) {
        for (double x = from; x <= to; x += step) {
            min.a(x);
        }
        System.out.printf("Minimal function value");
        System.out.println();
    }

    // В функции main() создаем объект безымянного класса:
    public static void main(String[] args) {
        printTable(-2, 2, 0.5, new FunctionToPrint() {
            @Override
            public double f(double x) {
                return x * x * x;
            }

            @Override
            public void print(double x) {
                System.out.printf("x = %9f f(x) = %9f%n", x, f(x));
            }
        });

        printMin(-2, 2, 0.5, new MinValue() {
            @Override
            public double a(double x) {
                double res = 0;
                return x * x * x < res ? res = x * x * x : res;
            }
        });
    }
}
