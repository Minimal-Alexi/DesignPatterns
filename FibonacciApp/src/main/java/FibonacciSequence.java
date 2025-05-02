import java.util.Iterator;

public class FibonacciSequence implements SequenceInterface{
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
