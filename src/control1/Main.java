package control1;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operator operator = new Operator();
        System.out.println(Operator.binaryOperator.applyAsInt(4,3));
    }
}
