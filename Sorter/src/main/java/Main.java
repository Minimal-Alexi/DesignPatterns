import Strategies.CountSort;
import Strategies.MergeSort;
import Strategies.SelectionSort;
import Strategies.SorterStrategy;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final int maxNumber = 10000000;
    private static final SorterStrategy[] strategies = {new CountSort(), new MergeSort(), new SelectionSort()};
    private static ArrayList<Integer> toBeSortedArray;
    private static final int[] sizes = {30, 100000};
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        for (int size : sizes) {
            arrayGenerator(size);
            for (SorterStrategy strategy : strategies) {
                sorter.setStrategy(strategy);
                sorter.sort(toBeSortedArray);
            }
        }
    }
    private static void arrayGenerator(int size){
        toBeSortedArray = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < size; ++i){
            toBeSortedArray.add(rand.nextInt(maxNumber));
        }
    }
}
