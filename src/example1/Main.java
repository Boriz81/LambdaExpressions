package example1;

import java.util.function.BiFunction;

public class Main {
    // как бы у нас выглядила метод как лямбда
    public static boolean isDivisible(int x, int y) {
        return x % y == 0;
    }
    public static void main(String[] args) {
        // однострочное лямбда выражение которое проверяет делится ли нацело
        // первое число на второе число
        BiFunction<Integer, Integer, Boolean>  isDivisible = (x, y) -> x % y == 0;
        System.out.println("Java: " + isDivisible(3,5));
        System.out.println("Ляьбда функция: " + isDivisible.apply(3,5));
    }
}
