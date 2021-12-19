package QueueTest;

import java.util.ArrayList;
import java.util.List;

// JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현
// dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null을 리턴하도록 함
// 다양한 데이터 타입을 다룰 수 있도록, Java Generic 타입 문법을 활용해보기
public class QueueTest1<T> {

    private List<T> queue = new ArrayList<T>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        QueueTest1<Integer> qt = new QueueTest1<Integer>();
        qt.enqueue(1);
        qt.enqueue(2);
        qt.enqueue(3);
        System.out.println("dequeue 실행 전, qt 상태 : " + qt.queue);
        System.out.println("dequeue 리턴 값 : " + qt.dequeue());
        System.out.println("dequeue 실행 후, qt 상태 : " + qt.queue);
    }
}
