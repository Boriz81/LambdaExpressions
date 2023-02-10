package control2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        System.out.println("Четное число: " + Operator.unaryOperator.applyAsLong(317));
        int chislo = new Scanner(System.in).nextInt();
        System.out.println(Operator.unaryOperator.applyAsLong(chislo));
    }
}
