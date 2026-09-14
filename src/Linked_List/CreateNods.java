class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreateNods {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.next = n3;

        // Display
        System.out.print(n1.data+" --> ");
        System.out.print(n1.next.data+" --> ");
        System.out.print(n1.next.next.data);
    }
}