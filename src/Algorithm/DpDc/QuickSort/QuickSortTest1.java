package Algorithm.DpDc.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest1 {
    public void splitFunc(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) {
            return;
        }
        int pivot = dataList.get(0);
        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for(int index = 1; index < dataList.size(); index++) {
            if(dataList.get(index) > pivot) {
                rightArr.add(dataList.get(index));
            } else {
                leftArr.add(dataList.get(index));
            }
        }

        System.out.println(leftArr);
        System.out.println(pivot);
        System.out.println(rightArr);
    }

    public static void main(String[] args) {
        Integer[] array = {4, 1, 2, 5, 7};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

        QuickSortTest1 qst = new QuickSortTest1();
        qst.splitFunc(list);
    }
}
