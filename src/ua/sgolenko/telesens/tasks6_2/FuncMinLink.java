package ua.sgolenko.telesens.tasks6_2;


import java.util.function.Function;

public class FuncMinLink {



    public static Double calc(Function<Double, Double> operator, Double x) {
        return operator.apply(x);
    }

    public static void main(String[] args) {
        Function<Double, Double> addTwo = x -> x + 2;
        Function<Double, Double> duplicate = x -> x * 2;
        System.out.println(calc(addTwo.compose(duplicate), 10.0)); // 22.0
        System.out.println(calc(addTwo.andThen(duplicate), 10.0)); // 24.0
    }
}
