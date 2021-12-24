package Algorithm.RecursiveCall;

import java.util.ArrayList;

// 배열의 합을 리턴하는 코드
public class RecursiveCallTest4 {
    public int factorialFunc(ArrayList<Integer> dataList) {
        if(dataList.size() <= 0) {
            return 0;
        }

        return dataList.get(0) + this.factorialFunc(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random() * 10);
            System.out.println((i + 1) + "번째 랜덤숫자 : " + randomNum);
            dataList.add(randomNum);
        }

        RecursiveCallTest4 rct = new RecursiveCallTest4();
        int result = rct.factorialFunc(dataList);
        System.out.println("배열의 합 : " + result);
    }
}
