package Algorithm.DpDc;

// 재귀함수 방법
public class FibonacciTest1 {
    public int recursiveCallFunc(int data) {
        if(data <= 1) {
            return data;
        }

        return this.recursiveCallFunc(data - 1) + this.recursiveCallFunc(data - 2);
    }

    public static void main(String[] args) {
        FibonacciTest1 ft = new FibonacciTest1();
        int result = ft.recursiveCallFunc(5);
        System.out.println(result);
    }
}
