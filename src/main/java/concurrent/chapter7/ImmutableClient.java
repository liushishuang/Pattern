package concurrent.chapter7;

import java.util.stream.IntStream;

/**
 * Immutable design pattern
 */
public class ImmutableClient {
    public static void main(String[] args) {

        //Share data
        Person person = new Person("Alex", "GuanSu");
        IntStream.range(0, 5).forEach(i ->
                new UsePersonThread(person).start()
        );
    }
}
