package Algorithm.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithmTest2 {
    public void KnapsackFunc(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            // o1은 [0][n], o2는 [1][n]
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                System.out.println("o2) " + o2[1] + " / " + o2[0] + " = " + (o2[1] / o2[0]));
                System.out.println("o1) " + o1[1] + " / " + o1[0] + " = " + (o1[1] / o1[0]));
                return (o2[1] / o2[0]) - (o1[1] / o1[0]);
            }
        });

        for(int index = 0; index < objectList.length; index++) {
            if ((capacity - (double) objectList[index][0]) > 0) {
                capacity -= (double)objectList[index][0];
                totalValue += (double)objectList[index][1];
                System.out.println("무게 : " + objectList[index][0] + ", 가치 : " + objectList[index][1]);
            } else {
                fraction =  capacity / (double)objectList[index][0];
                totalValue += (double)objectList[index][1] * fraction;
                System.out.println("무게 : " + objectList[index][0] + ", 가치 : " + objectList[index][1] + ", 비율 : " + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치 : " + totalValue);
    }

    public static void main(String[] args) {
        GreedyAlgorithmTest2 gat = new GreedyAlgorithmTest2();
        Integer[][] objectList = {{10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};
        gat.KnapsackFunc(objectList, 30.0);
    }
}
