package ua.sgolenko.telesens.tasks6_1;

public class SolveUsingLambda {

    public static void main(String[] args) {
        System.out.println("Lambda approach: ");
        System.out.println(FuncMin.printMin(-2, 2, 0.5, (x, y) -> x < y ? x : y));
    }
}
