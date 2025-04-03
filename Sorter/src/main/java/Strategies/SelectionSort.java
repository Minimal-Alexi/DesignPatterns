package Strategies;

import java.util.ArrayList;

public class SelectionSort implements SorterStrategy{

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size()-1; i++){
            for(int j = i+1; j < arrayList.size(); j++){
                if(arrayList.get(i).compareTo(arrayList.get(j)) > 0){
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        return arrayList;
    }

    @Override
    public String getName() {
        return "Selection Sort";
    }
}
