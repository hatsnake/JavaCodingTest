package ArrayTest;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 3차원 배열에서 8, 10, 2를 순서대로 각각 라인에 출력
        // System.out.println() 사용
        Integer[][][] data_list = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // 출력
        System.out.println(data_list[1][0][1]);
        System.out.println(data_list[1][1][0]);
        System.out.println(data_list[0][0][1]);
    }
}
