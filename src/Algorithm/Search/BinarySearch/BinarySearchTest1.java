package Algorithm.Search.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchTest1 {
    private static Integer searchCount = 0;

    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        if(dataList.size() == 1 && searchItem == dataList.get(0)) {
            return true;
        }

        if(dataList.size() == 1 && searchItem != dataList.get(0)) {
            return false;
        }

        if(dataList.size() == 0) {
            return false;
        }

        int medium = dataList.size() / 2;

        searchCount++;
        if(searchItem == dataList.get(medium)) {
            return true;
        } else {
            if(searchItem < dataList.get(medium)) {
                // 왼쪽 리스트
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(0, medium)), searchItem);
            } else {
                // 오른쪽 리스트
                return this.searchFunc(new ArrayList<Integer>(dataList.subList(medium + 1, dataList.size())), searchItem);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        Integer searchItem = 32;
        
        for(int i = 0; i < 100; i++) {
            dataList.add((int)(Math.random() * 100));
        }
        // 이진 탐색은 정렬이 되어야 한다.
        Collections.sort(dataList);

        BinarySearchTest1 bst = new BinarySearchTest1();
        boolean result = bst.searchFunc(dataList, searchItem);
        
        System.out.println(dataList);
        System.out.println("이진탐색을 통해 " + searchItem + " 데이터를 찾습니다.");
        System.out.println("탐색횟수 : " + searchCount);
        if(result == true) {
            System.out.println(searchItem + " 데이터를 찾았습니다.");
        } else {
            System.out.println(searchItem + " 데이터를 찾지 못했습니다.");
        }
    }
}
