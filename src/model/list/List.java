package model.list;

import model.node.Node;

public class List<T> {
    private Node<T> first;
    private Node<T> current;

    /*
    Die Anfrage liefert den Wert true, wenn die Liste keine Objekte
    enthält, sonst liefert sie den Wert false.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /*
    Die Anfrage liefert den Wert true, wenn es ein aktuelles Objekt
    gibt, sonst liefert sie den Wert false.
     */
    public boolean hasAccess() {
        return current != null;
    }

    /*
    Falls die Liste nicht leer ist, es ein aktuelles Objekt gibt und
    dieses nicht das letzte Objekt der Liste ist, wird das dem
    aktuellen Objekt in der Liste folgende Objekt zum aktuellen
    Objekt, andernfalls gibt es nach Ausführung des Auftrags kein
    aktuelles Objekt.
     */
    public void next() {
        if (isEmpty()) {
            return;
        }

        //Es gibt kein Aktuelles Objekt. Also wird das erste Object zum aktuellem Objekt
        if (!hasAccess()) {
            current = first;
            return;
        }

        if (current.getNext() != null) {
             current = current.getNext();
        }

    }

    /*
    Falls die Liste nicht leer ist, wird das erste Objekt der Liste
    aktuelles Objekt. Ist die Liste leer, geschieht nichts
     */
    public void toFirst() {
        if (isEmpty()) {
            return;
        }

        current = first;

    }

    /*
    Falls die Liste nicht leer ist, wird das letzte Objekt der Liste
    aktuelles Objekt. Ist die Liste leer, geschieht nichts.
     */
    public void toLast() {
        if (isEmpty()) {
            return;
        }

        Node<T> tmp = first;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }

        current = tmp;

    }

    /*
    Falls es ein aktuelles Objekt gibt, wird das aktuelle Objekt
    zurückgegeben, andernfalls gibt die Anfrage den Wert null
    zurück.
     */
    public T getObject() {
        if (isEmpty()) {
            return null;
        }

        return current.getContains();
    }

    /*
    Falls es ein aktuelles Objekt gibt und pObject ungleich null ist,
    wird das aktuelle Objekt durch pObject ersetzt.
     */
    //!!Falsch
    public void setObject(T pObject) {
        if (isEmpty() || !hasAccess() || pObject == null) {
            return;
        }

        current = new Node<T>(pObject);
    }

    /*
    Ein neues Objekt pObject wird am Ende der Liste angefügt.
    Das aktuelle Objekt bleibt unverändert. Wenn die Liste leer ist,
    wird das Objekt pObject in die Liste eingefügt und es gibt
    weiterhin kein aktuelles Objekt.
    Falls pObject gleich null ist, bleibt die Liste unverändert.
     */
    public void append(T pObject) {
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

        tmp.setNext(new Node<T>(pObject));
    }
}
