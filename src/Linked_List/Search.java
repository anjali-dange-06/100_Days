public class Search {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    //adding at last
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
    // Search an element
    boolean Search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Search list = new Search();
        // Creatingg linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
    
        list.display();
        if (list.Search(30)) {
            System.out.println("30 is found");
        } else {
            System.out.println("30 is not found");
        }
        if (list.Search(50)) {
            System.out.println("50 is found");
        } else {
            System.out.println("50 is not found");
        }
    }
}