import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
public class ReverseDLL{
public static Node reversedLL(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node back = null;
    Node current = head;
    while (current != null) {// here swapping of links takes place we are not swapping the nodes
        back = current.prev;// we just change the links from next to prev and vice-versa.
        current.prev = current.next;
        current.next = back;

        current = current.prev;
    }
    return back.prev;
}

    public static void printDLL(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the doubly linked list
        System.out.print("Enter the number of elements in the doubly linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the doubly linked list:");
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Reversing the doubly linked list
        head = reversedLL(head);

        // Printing the reversed doubly linked list
        System.out.println("Reversed Doubly Linked List:");
        printDLL(head);
    }
}