package Algorithm.DpDc.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortTest1 {
    public void splitFunc(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) {
            return;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        // 0부터 medium - 1 인덱스 번호까지 해당 배열 아이템을 서브 배열로 추출
        leftArr = new ArrayList<Integer>(dataList.subList(0, medium));
        rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));

        System.out.println("왼쪽 배열 : " + leftArr);
        System.out.println("오른쪽 배열 : " + rightArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        for(int i=0; i<9; i++) {
            dataList.add((int)(Math.random()*100));
        }

        MergeSortTest1 mt = new MergeSortTest1();
        // 랜덤 배열
        mt.splitFunc(dataList);
        // asList 배열
        mt.splitFunc(new ArrayList<Integer>(Arrays.asList(4,3,1,6,9)));
    }
}
