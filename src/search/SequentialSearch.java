package search;

import java.util.ArrayList;

public class SequentialSearch {
    public int searchFunc(ArrayList<Integer> dataList, int searchItem) {
        for(int index=0; index < dataList.size(); index++) {
            if(dataList.get(index) == searchItem) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SequentialSearch mySearch = new SequentialSearch();
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for(int index=0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }

        System.out.println(testData);
        System.out.println(mySearch.searchFunc(testData, 11)); // 찾고자 하는 11 이라는 숫자가 없으면 -1을 리턴, 있으면 해당 인덱스를 리턴
    }
}