package control1;

import java.util.function.IntBinaryOperator;

public class Operator {
    public static IntBinaryOperator binaryOperator = (x, y) -> {
        if (x > y) {
            return x;
        } else if (y > x) {
            return y;
        } return 0;
    };

}
