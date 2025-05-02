import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> iterator = fibonacciSequence.iterator();
        int number = 1;
        while (number != 10) {
            System.out.println(number +": "+iterator.next());
            number++;
        }
    }
}
