package Algorithm.DpDc.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest2 {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) {
            return dataList;
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

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        // 재귀함수로 왼쪽, 오른쪽 함수 반복하여 정렬
        mergedArr.addAll(this.sort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr));

        return mergedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        for(int index = 0; index < 100; index++) {
            dataList.add((int)(Math.random() * 100));
        }

        QuickSortTest2 qst = new QuickSortTest2();
        ArrayList<Integer> dataListSort = qst.sort(dataList);
        System.out.println(dataListSort);
    }
}
