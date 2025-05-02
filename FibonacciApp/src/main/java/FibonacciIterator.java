import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    int[] currentSequence = new int[2];
    int returnValue;
    public FibonacciIterator() {
        currentSequence[0] = 1;
        currentSequence[1] = 1;
        returnValue = 0;
    }
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int result;
        if(returnValue != 2) {
            result = currentSequence[returnValue];
            returnValue++;
        }
        else {
            result = currentSequence[0] + currentSequence[1];
            currentSequence[0] = currentSequence[1];
            currentSequence[1] = result;
        }
        return result;
    }
}
