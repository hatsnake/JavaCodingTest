package Algorithm.DpDc.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTest2 {
    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        // 0부터 medium - 1 인덱스 번호까지 해당 배열 아이템을 서브 배열로 추출
        leftArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
        rightArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        return this.mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;
        
        // CASE1 : left/right 둘 다 있을 때
        while(leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if(leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        // CASE2 : right 데이터가 없을 때
        while(leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }
        
        // CASE3 : left 데이터가 없을 때
        while(rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for(int i=0; i<100; i++) {
            testData.add((int)(Math.random()*100));
        }

        MergeTest2 mt = new MergeTest2();
        ArrayList<Integer> dataSort = mt.mergeSplitFunc(testData);
        System.out.println(dataSort);
    }
}
