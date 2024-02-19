import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteNode {
    static Node deleteNodeX(Node head,int x){
        if(head==null)
            return head;
        if(x==1){
            head=head.next;
            return head;
        }
        int count=1;
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            if(count==x){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    static void printList(Node node){
        while(node !=null){
            System.out.println(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNode del=new DeleteNode();
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int x=sc.nextInt();
        head=DeleteNode.deleteNodeX(head,x);
        DeleteNode.printList(head);
    }
}