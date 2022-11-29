package model.stack;

import model.node.Node;

import java.awt.*;

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
        /*
        if (isEmpty()) {
            return null;
        }
        */
        return (T) first.getContains();
    }

    public T loop() {
        Node<T> tmp = first;
        for (; tmp.getNext() != null; tmp = tmp.getNext()) {
            System.out.println(tmp.getContains());
        }

        System.out.println(tmp.getContains());
        return null;
    }
}
