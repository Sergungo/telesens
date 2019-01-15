package ua.sgolenko.telesens.tasks6_1;

class MyFunction implements Function {

    @Override
    public double a(double x, double y) {
        return x < y ? x : y;
    }

    public static class InterfaceTestWithUsualClass {

        public static void main(String[] args) {
            System.out.println("Usual class approach: ");
            System.out.println(FuncMin.printMin(-2, 2, 0.5, new MyFunction()));
        }
    }
}
