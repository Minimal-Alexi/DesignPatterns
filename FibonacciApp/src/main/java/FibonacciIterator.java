import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    int previous1,previous2;
    public FibonacciIterator() {
        previous1 = 1;
        previous2 = 1;
    }
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int result = previous1 + previous2;
        previous1 = previous2;
        previous2 = result;
        return result;
    }
}
