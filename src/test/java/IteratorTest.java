import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    @Test
    public void test() {

        List<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");
        IteratorImpl iteratorImpl = new IteratorImpl(test);
        while (iteratorImpl.hasNext()) {
            System.out.println(iteratorImpl.next());
        }

    }

    class IteratorImpl implements Iterator<String> {
        private List<String> list;
        private int index = 0;

        public IteratorImpl(List<String> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public String next() {
            return list.get(index++);
        }
    }
}
