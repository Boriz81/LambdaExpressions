package example3;

import java.util.function.Function;

public class Main {
    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY YEAR"));
    }
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        printResultOfLambda(f);
    }
}
