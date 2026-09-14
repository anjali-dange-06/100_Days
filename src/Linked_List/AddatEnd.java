//package Linked_List;
public class AddatEnd {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    void addAtEnd(int data) {
        Node newNode = new Node(data);
        // for empthyy linked list
        if (head == null) {
            head = newNode;
            return;
        }
        // lets go to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
//ading element at the last
         temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        AddatEnd list = new AddatEnd();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        list.display();
    }
}