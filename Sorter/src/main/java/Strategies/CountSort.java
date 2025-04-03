package Strategies;

import java.util.ArrayList;

public class CountSort implements SorterStrategy{
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        int[] countList = new int[max + 1];
        for (int i = 0; i < arrayList.size(); i++) {
            countList[arrayList.get(i)]++;
        }
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < countList.length; i++) {
            while (countList[i] > 0) {
                sortedList.add(i);
                countList[i]--;
            }
        }
        return sortedList;
    }

    @Override
    public String getName() {
        return "Count Sort";
    }
}
