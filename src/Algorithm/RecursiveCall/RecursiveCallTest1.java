package Algorithm.RecursiveCall;

public class RecursiveCallTest1 {
    public int FactorialFunc(int n) {
        if(n > 1) {
            return n * this.FactorialFunc(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        RecursiveCallTest1 rct = new RecursiveCallTest1();
        int factorialNum = 5;
        int result = rct.FactorialFunc(factorialNum);
        System.out.println(factorialNum + "!의 결과 : " + result);
    }
}
