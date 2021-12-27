package Algorithm.Sort.BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

// 랜덤 숫자
// ※ 왜 dataList.size() - 1를 하는지 모르겠음..
public class BubbleSortTest4 {
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
        for(int i=0; i < 10; i++) {
            dataList.add((int)(Math.random()*10));
        }
        System.out.println("버블정렬 완료전 : " + dataList);

        BubbleSortTest4 bst = new BubbleSortTest4();

        ArrayList<Integer> dataListSort = bst.sort(dataList);
        System.out.println("버블정렬 완료후 : " + dataListSort);

    }
}
