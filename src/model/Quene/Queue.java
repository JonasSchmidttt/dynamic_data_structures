package model.Quene;

import model.node.Node;

public class Queue<T> {
    private Node<T> first;

    /*
    Die Anfrage liefert den Wert true, wenn die Schlange keine
    Objekte enthält, sonst liefert sie den Wert false.
     */
    boolean isEmpty() {
        return first == null;
    }

    /*
    Das Objekt pObject wird an die Schlange angehängt. Falls
    pObject gleich null ist, bleibt die Schlange unverändert
     */
    public void enqueue(T pObject) {
        if (pObject == null) {
            return;
        }

        if (isEmpty()) {
            first = new Node<T>(pObject);
            return;
        }

        Node<T> tmp = first;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node(pObject));
    }

    /*
    Das erste Objekt wird aus der Schlange entfernt. Falls die
    Schlange leer ist, wird sie nicht verändert
     */
    public T dequeue() {
        Node<T> tmp = first;
        if (tmp != null) {
            first = tmp.getNext();
        }

        return tmp.getContains();
    }

    /*
    Die Anfrage liefert das erste Objekt der Schlange. Die
    Schlange bleibt unverändert. Falls die Schlange leer ist, wird
    null zurückgegeben
     */
    public T front() {
        if (isEmpty()) {
            return null;
        }
        return first.getContains();
    }

    public String loop() {
        String ret = "[";
        Node<T> tmp = first;
        for (; tmp.getNext() != null; tmp = tmp.getNext()) {
            ret += tmp.getContains() + "\n";
        }
        ret += tmp.getContains() + "]";
        return ret;
    }
}
