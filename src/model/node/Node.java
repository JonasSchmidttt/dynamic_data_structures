package model.node;

public class Node<T> {

    public Node(T pContains) {
        this.contains = pContains;
    }


    private Node<T> next;
    private T contains;


    //getter und setter
    public void setNext(Node pNext) {
        this.next = pNext;
    }
    public Node getNext() {
        return this.next;
    }

    public void setContains(T pContains) {
        this.contains = pContains;
    }
    public T getContains() {
        return this.contains;
    }
}
