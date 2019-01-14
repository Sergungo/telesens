package ua.sgolenko.telesens.tasks6_1;


public class InterfaceTestWithNonameClass {

    public static void main(String[] args) {
        System.out.println("Noname class approach: ");
        System.out.println(FuncMin.printMin(-2, 2, 0.5, new MinValue() {
            public double a(double x, double y) {
                return x < y ? x : y;
            }
        }));
    }

}
