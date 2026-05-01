public class List {

    private Node head;
    private int size;

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void addByIndex(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("Помилка: неправильний індекс");
            return;
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public void removeByIndex(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Помилка: неправильний індекс");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Помилка: неправильний індекс");
            return -1;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return size;
    }

    public void printList() {

        Node current = head;

        System.out.print("Список: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}