package StackTest;

import java.util.ArrayList;
import java.util.List;

public class StackTest1<T> {
    private List<T> stack = new ArrayList<T>();
    
    public void push(T item) {
        stack.add(item);
    }
    
    public T pop() {
        if(stack.isEmpty()) {
            return null;
        }
        
        int lastIndex = stack.size() - 1;
        
        return stack.remove(lastIndex);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        StackTest1<Integer> st = new StackTest1<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("pop 실행전 : " + st.stack);        
        System.out.println("pop 실행 : " + st.pop());
        System.out.println("pop 실행후 : " + st.stack);
    }
}
