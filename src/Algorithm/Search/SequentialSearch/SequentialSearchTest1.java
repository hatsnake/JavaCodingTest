package Algorithm.Search.SequentialSearch;

import java.util.ArrayList;

public class SequentialSearchTest1 {
    public Integer searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        Integer searchCount = 0;
        for(int index=0; index < dataList.size(); index++) {
            searchCount++;
            if(dataList.get(index) == searchItem) {
                System.out.println(searchCount +"번에 원하는 값을 찾았습니다.");
                return index;
            }
        }
        System.out.println(searchCount + "번 탐색을 하였지만 원하는 값을 찾지 못했습니다.");
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        Integer searchItem = 32;

        for(int i = 0; i < 10; i++) {
            dataList.add((int)(Math.random() * 100));
        }

        SequentialSearchTest1 sst = new SequentialSearchTest1();
        Integer result = sst.searchFunc(dataList, searchItem);

        System.out.println(dataList);
        if(result == -1) {
            System.out.println(searchItem + "를 찾지 못했습니다.");
        } else {
            System.out.println(searchItem + "를 " + result + "번째 인덱스에서 찾았습니다.");
        }
    }
}
