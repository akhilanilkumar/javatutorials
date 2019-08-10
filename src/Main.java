import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println(binaryOperator.andThen(getIntData).apply(10, 15));
        out.println(maxBy.apply(20, 30));
        out.println(minBy.apply(20, 30));
        out.println(biPredicate.test(5, 6));
    }

    public static Function<Integer, Integer> getIntData = x -> x + 1;

    public static BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.naturalOrder());

    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.naturalOrder());

    static BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
}