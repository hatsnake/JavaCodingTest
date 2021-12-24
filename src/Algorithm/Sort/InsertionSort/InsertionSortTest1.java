package Algorithm.Sort.InsertionSort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSortTest1 {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        for(int i = 0; i < dataList.size() - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(dataList.get(j) < dataList.get(j - 1)) {
                    Collections.swap(dataList, j, j - 1);
                } else {
                    break;
                }
            }
            System.out.println((i + 1) + "번 째 삽입정렬 : " + dataList);
        }

        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            dataList.add((int)(Math.random() * 100));
        }
        System.out.println("삽입정렬 완료전 : " + dataList);

        InsertionSortTest1 ist  =  new InsertionSortTest1();
        ArrayList<Integer> dataListSort =  ist.sort(dataList);
        System.out.println("삽입정렬 완료후 : " + dataListSort);
    }
}
