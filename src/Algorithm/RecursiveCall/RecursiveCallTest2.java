package Algorithm.RecursiveCall;

// 재귀 용법 2번째 방법
public class RecursiveCallTest2 {
    public int factorialFunc(int n) {
        if(n <= 1) {
            return 1;
        }
        
        return n * this.factorialFunc(n - 1);
    }

    public static void main(String[] args) {
        RecursiveCallTest2 rct = new RecursiveCallTest2();
        int result = rct.factorialFunc(5);
        System.out.println(result);
    }

}
