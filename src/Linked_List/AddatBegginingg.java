class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class AddatBegginingg {
    Node head;
    void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }    public static void main(String[] args) {
        AddatBegginingg list = new AddatBegginingg();
        list.addAtBeginning(30);
        list.addAtBeginning(20);
        list.addAtBeginning(10);
        
        list.display();
    }
}