import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsTest {
    @Test
    public void test() {

        List<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");

        test.removeIf(s -> s.equals("2"));
        System.out.println("test = " + test);
    }

    @Test
    public void test2() {

        List<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");

        Stream<String> stream = test.stream();

        Map<String, List<String>> collect = stream.collect(Collectors.groupingBy(s -> s));
        System.out.println("collect1 = " + collect);
    }
}
