package Algorithm.Sort.SelectionSort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSortTest1 {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest;

        for(int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;
            for(int index = stand + 1; index < dataList.size(); index++) {
                if(dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }

            Collections.swap(dataList, lowest, stand);
            System.out.println((stand + 1) + "번 째 선택 정렬 : " + dataList);
        }

        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            dataList.add((int)(Math.random() * 100));
        }
        System.out.println("선택정렬 완료전 : " + dataList);

        SelectionSortTest1 sst = new SelectionSortTest1();
        ArrayList<Integer> dataListSort = sst.sort(dataList);
        System.out.println("선택정렬 완료후 : " + dataListSort);
     }
}
