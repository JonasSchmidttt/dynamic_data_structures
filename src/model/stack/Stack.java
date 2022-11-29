package model.stack;

import model.node.Node;


public class Stack<T> {
    private Node<T> first;

    /*
    Liefert den Wert true, wenn der Stack leer ist
    */
    public boolean isEmpty() {
        return first == null;
    }

    /*
    Das Objekt T wird oben auf den Stack gelegt. Falls
    T gleich null ist, bleibt der Stack unverändert.
    */
    public void push(T pObject) {
        if (pObject == null) {
            return;
        }
        if (first == null) {
            first = new Node(pObject);
            return;
        }

        Node<T> tmp = first;
        first = new Node(pObject);
        first.setNext(tmp);
    }


    /*
    Das zuletzt eingefügte Objekt wird von dem Stack entfernt.
    Falls der Stack leer ist, bleibt er unverändert.
    */
    public T pop() {
       Node<T> tmp = first;

       if (tmp.getNext() != null) {
           first = tmp.getNext();
       }
       return tmp.getContains();
    }

    /*
    Die Anfrage liefert das oberste Object auf dem Stack. Der Stack bleibt
    unverändert. Falls der Stack leer ist, wird null zurückgegeben
    */
    public T top() {

        if (isEmpty()) {
            return null;
        }

        return first.getContains();
    }

    public String loop() {
        String ret = "";
        Node<T> tmp = first;
        for (; tmp.getNext() != null; tmp = tmp.getNext()) {
            ret += tmp.getContains();
        }

        ret += tmp.getContains();
        return ret;
    }

    public int lenght() {
        int count = 0;
        Node<T> tmp = first;
        while (tmp.getNext() != null) {
            count++;
        }
        System.out.println(count);
        return count;
    }

    public String[] toArray() {
        String[] ret = new String[lenght()];

        return ret;
    }
}
