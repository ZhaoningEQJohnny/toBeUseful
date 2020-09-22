class Node {
    public int value;
    public Node next;
    public Node prev;
    public Node(int i){
        value = i;
    }
    public Node(){

    }
}

public class Deque {
    private Node head;
    private Node tail;
    public Deque(){

    }
    public void insertFromHead(Node node){
        if(head!=null) {
            head.prev = node;
            node.next = head;
            node.prev = null;
            if(tail==null){
                tail = head;
            }
        }
        head = node;
    }
    public void insertFromTail(Node node){
        if(tail!=null){
            tail.next = node;
            node.prev = tail;
            node.next = null;
            if(head==null){
                head = tail;
            }
        }
        tail = node;
    }
    public void printAllFromHead(){
        Node curNode = head;
        while(curNode.next!=null){
            System.out.print(curNode.value+", ");
            curNode = curNode.next;
        }
        System.out.print(curNode.value);
        System.out.println();
    }
    public void printAllFromTail(){
        Node curNode = tail;
        while(curNode.prev!=null){
            System.out.print(curNode.value+", ");
            curNode = curNode.prev;
        }
        System.out.print(curNode.value);
        System.out.println();
    }
    public boolean delete(int num){
        Node curNode = head;
        if(curNode.value==num){
            head = curNode.next;
            head.prev = null;
            return true;
        }
        while(curNode.next!=null){
            if(curNode.value==num){
                curNode.prev.next = curNode.next;
                curNode.next.prev = curNode.prev;
                return  true;
            }
            curNode = curNode.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.insertFromHead(new Node(6));
        deque.insertFromHead(new Node(7));
        deque.insertFromHead(new Node(9));
        deque.insertFromHead(new Node(8));
        deque.insertFromHead(new Node(10));
        deque.insertFromHead(new Node(11));
        deque.insertFromHead(new Node(12));
        deque.insertFromTail(new Node(5));
        deque.insertFromTail(new Node(4));
        deque.insertFromTail(new Node(3));
        deque.insertFromTail(new Node(2));
        deque.insertFromTail(new Node(1));
        deque.printAllFromHead();
        deque.printAllFromTail();
        deque.delete(7);
        deque.delete(11);
        deque.printAllFromHead();
    }
}
