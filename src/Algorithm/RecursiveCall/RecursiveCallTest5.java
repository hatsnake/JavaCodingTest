package Algorithm.RecursiveCall;

// 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지
// 정수 n이 입력으로 주어졌을 때, n을 1, 2, 3의 합으로 나타낼 수 있는 방법의 수 구하기
public class RecursiveCallTest5 {
    public int factorialFunc(int data) {
        if(data == 1) {
            return 1;
        } else if(data == 2) {
            return 2;
        } else if(data == 3) {
            return 4;
        }

        return this.factorialFunc(data - 1) +
               this.factorialFunc(data - 2) +
               this.factorialFunc(data - 3);
    }

    public static void main(String[] args) {
        RecursiveCallTest5 rct = new RecursiveCallTest5();
        int result = rct.factorialFunc(5);
        System.out.print(result);
    }
}
