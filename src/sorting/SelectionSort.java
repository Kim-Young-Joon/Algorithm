package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int item, swapIndex;
        for(int index=0; index < dataList.size()-1; index++) {
            item = dataList.get(index);
            swapIndex = index;
            for(int index2=index+1; index2<dataList.size(); index2++) {
                if(dataList.get(index2) < item) {
                    item = dataList.get(index2);
                    swapIndex = index2;
                }
            }
            Collections.swap(dataList, index, swapIndex);
        }
        return dataList;
    }

    public static void main(String []args) {
        ArrayList<Integer> testData = new ArrayList<>();

        for(int i=0; i<100; i++) {
            testData.add((int)(Math.random()*100));
        }
        SelectionSort sSort = new SelectionSort();

        System.out.println(sSort.sort(testData));
    }
}
