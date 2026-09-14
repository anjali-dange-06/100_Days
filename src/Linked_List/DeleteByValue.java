public class DeleteByValue {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // Add node at the end
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
    void deleteByValue(int value) {
        // Empty
        if (head == null) {
            return;
        }
        // If values is in the 1st  nodi
        if (head.data == value) {
            head = head.next;
            return;
        }
        // Starting from the head
        Node temp = head;
        // Find the node before the value
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        // Delete the node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteByValue list = new DeleteByValue();
        // Creating the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Before deletion:");
        list.display();
        // Delete 30
        list.deleteByValue(30);
        System.out.println("After deleting 30:");
        list.display();
    }
}