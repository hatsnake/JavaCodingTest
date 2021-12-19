package LinkedListTest;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if(head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if(head != null) {
            Node<T> node = this.head;
            System.out.print(node.data + " → ");
            while(node.next != null) {
                node = node.next;
                System.out.print(node.data + " → ");
            }
            System.out.println("");
        }
    }

    public Node<T> search(T data) {
        if(this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while(node != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if(searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData) {
        if(this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if(node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while(node.next != null) {
                    if(node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> sl = new SingleLinkedList<Integer>();
        sl.addNode(1);
        System.out.println("head의 노드 데이터 : " + sl.head.data);

        sl.addNode(2);
        System.out.println("head의 포인터 : " + sl.head.next);
        System.out.println("head의 다음 노드 데이터 : " + sl.head.next.data);

        sl.addNode(3);
        sl.printAll();

        // 중간에 데이터 넣기
        sl.addNodeInside(5, 1);
        sl.printAll();

        // 없는 데이터를 찾도록 해서, 맨 마지막에 데이터 넣기
        sl.addNodeInside(7, 20);
        sl.printAll();

        // 중간 노드 삭제
        sl.delNode(3);
        sl.printAll();

        // 헤드 노드 삭제
        sl.delNode(1);
        sl.printAll();

        // 마지막 노드 삭제
        sl.delNode(7);
        sl.printAll();

        // 없는 노드 삭제
        sl.delNode(20);
        sl.printAll();
    }
}
