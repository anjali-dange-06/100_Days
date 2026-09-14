public class DeleteLast {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void deleteLast() {
        // empty
        if (head == null) {
            return;
        }
        // If only one nodi is present
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        DeleteLast list = new DeleteLast();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        System.out.println();
        System.out.println();
        list.deleteLast();
        list.display();
    }
}