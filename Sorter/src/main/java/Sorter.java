import Strategies.SorterStrategy;

import java.util.ArrayList;

public class Sorter {
    private SorterStrategy strategy;
    public Sorter(){

    }
    public void sort(ArrayList<Integer> list){
        System.out.println("Sorting list of " + list.size() + " elements using the: " + strategy.getName());
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> sortedList = strategy.sort(list);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        if(sortCheck(sortedList)) {
            System.out.println("List of " + sortedList.size() + " elements sorted in " + elapsedTime + "ms using the: " + strategy.getName() + "\n");
        }
        else {
            System.out.println("List of " + sortedList.size() + " elements failed sorting in " + elapsedTime + "ms using the: " + strategy.getName() + "\n");
        }
    }
    public void setStrategy(SorterStrategy strategy){
        this.strategy = strategy;
    }
    private boolean sortCheck(ArrayList<Integer> list){
        for(int i = 0; i<list.size() - 1; i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
