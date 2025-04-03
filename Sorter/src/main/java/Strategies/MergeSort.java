package Strategies;

import java.util.ArrayList;

public class MergeSort implements SorterStrategy{
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        return sortRecursion(arrayList, 0, arrayList.size() - 1);
    }
    private ArrayList<Integer> sortRecursion(ArrayList<Integer> arrayList, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            sortRecursion(arrayList,l,m);
            sortRecursion(arrayList,m+1,r);
            merge(arrayList,l,m,r);
        }
        return arrayList;
    }
    @Override
    public String getName() {
        return "Merge Sort";
    }
    private void merge(ArrayList<Integer> arrayList, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int[] tempLeft = new int[sizeLeft];
        int[] tempRight = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            tempLeft[i] = arrayList.get(left + i);
        }
        for (int i = 0; i < sizeRight; i++) {
            tempRight[i] = arrayList.get(mid + 1 + i);
        }

        int i = 0, j = 0;
        int k = left;
        while (i < sizeLeft && j < sizeRight) {
            if (tempLeft[i] < tempRight[j]) {
                arrayList.set(k,tempLeft[i]);
                i++;
            }
            else {
                arrayList.set(k,tempRight[j]);
                j++;
            }
            k++;
        }
        while (i < sizeLeft) {
            arrayList.set(k,tempLeft[i]);
            i++;
            k++;
        }
        while (j < sizeRight) {
            arrayList.set(k,tempRight[j]);
            j++;
            k++;
        }

    }
}
