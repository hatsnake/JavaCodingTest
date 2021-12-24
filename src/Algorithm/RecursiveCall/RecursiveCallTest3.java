package Algorithm.RecursiveCall;

public class RecursiveCallTest3 {
    public int factorialFunc(int num) {
        if(num <= 1) {
            return num;
        }

        return num * this.factorialFunc(num - 1);
    }

    public static void main(String[] args) {
        RecursiveCallTest3 rst = new RecursiveCallTest3();
        int result = rst.factorialFunc(5);
        System.out.println(result);
    }
}
