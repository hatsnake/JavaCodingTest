package Algorithm.BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

// 데이터 4개(1, 9, 3, 2)
public class BubbleSortTest3 {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for(int i = 0; i < dataList.size() - 1; i++) {
            boolean swap = false;

            for(int j = 0; j < (dataList.size() - 1) - i; j++) {
                if (dataList.get(j) > dataList.get(j + 1)) {
                    Collections.swap(dataList, j, j + 1);
                    swap = true;
                }
            }

            if(swap == false) {
                break;
            }

            System.out.println((i + 1) + "번 째 버블정렬 결과 : " + dataList);
        }

        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(1);
        dataList.add(9);
        dataList.add(3);
        dataList.add(2);

        BubbleSortTest3 bst = new BubbleSortTest3();

        ArrayList<Integer> dataListSort = bst.sort(dataList);
        System.out.println(dataListSort);
    }
}
