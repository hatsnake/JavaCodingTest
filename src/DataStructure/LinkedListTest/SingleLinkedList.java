package DataStructure.LinkedListTest;

public class SingleLinkedList<T> {
    // 시작 위치(head)는 null
    public Node<T> head = null;

    // 마지막 위치에 노드 추가
    public void addNode(T data) {
        if(head == null) {
            // head가 null이면 들어온 값을 head에 삽입한다.
            head = new Node<T>(data);
        } else {
            // head를 기준으로 다음 데이터 주소가 null이 아니면
            // node 위치를 이동하면서 마지막 노드로 이동한다.
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            // 마지막 노드 next에 들어온 값을 삽입한다.
            node.next = new Node<T>(data);
        }
    }

    // 노드 전체 출력
    public void printAll() {
        // 노드에 값이 있을 때
        if(head != null) {
            // head 데이터를 출력하기
            Node<T> node = this.head;
            System.out.print(node.data + " → ");
            // 다음 노드가 없을 때까지 다음 노드 데이터 반복 출력
            while(node.next != null) {
                node = node.next;
                System.out.print(node.data + " → ");
            }
            System.out.println("");
        }
    }

    // 특정 노드 찾기
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

    // 중간에 노드 추가 (특정 데이터 뒤에)
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

    // 노드 삭제
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
