package dataSructures.list;

import java.util.Optional;

public class List<T> {

    private Node<T> head = null;

    public Optional<Node<T>> search(T value) {
        if (head == null) {
            return Optional.empty();
        }
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return Optional.of(current);
            }
            current = current.getNext();
        }
        return Optional.empty();
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
}

    public void insert (T value, int index) {
        Node<T> newNode = new Node<>(value);
        if (head == null){
            head = newNode;
            return;
        }
        if (index == 0){
            newNode.setNext(head);
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.getNext()!= null && index - 1 > 0){
            current = current.getNext();
            index--;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    @Override
    public String toString() {
        String s = "Lista: ";
        Node<T> current = head;
        while (current != null) {
            s += current.getValue() + ", ";
            current = current.getNext();
        }
        return s;
    }
}

