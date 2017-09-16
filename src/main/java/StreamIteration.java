import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class StreamIteration {
    public void printOperationExecution() {
        List result = IntStream.range(1, 10)
                .peek(value -> System.out.println("START: " + value))
                .filter(value -> greaterThan3(value))
                .filter(value -> lessThan9(value))
                .map(value -> squared(value))
                .map(value -> times2(value))
                .peek(value -> System.out.println("END: " + value))
                .mapToObj(Integer::new)
                .collect(toList());
        System.out.println("Result: " + result);
    }

    private int times2(int value) {
        System.out.println("times2: " +value);
        return value*2;
    }

    private int squared(int value) {
        System.out.println("Squaring: " + value);
        return value*value;
    }

    private boolean lessThan9(int value) {
        System.out.println("lessThan9: " + value);
        return value < 9;
    }

    private boolean greaterThan3(int value) {
        System.out.println("greaterThan3: " + value);
        return value > 3;
    }
}
