package control2;

import java.util.function.LongUnaryOperator;

public class Operator {
    public static LongUnaryOperator unaryOperator = (x) -> {
        if ((x + 1) % 2 == 0) {
            return (x + 1);
        } else {
            return (x + 2);
        }
    };
}
