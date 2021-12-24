package Algorithm.Sort.BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

// 데이터 3개(9, 2, 4)
public class BubbleSortTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(9);
        dataList.add(2);
        dataList.add(4);

        for(int index = 0; index < dataList.size() - 1; index++) {
            if(dataList.get(index) > dataList.get(index + 1)) {
                Collections.swap(dataList, index, index + 1);
            }
        }

        System.out.println(dataList);
    }
}
