import java.util.*;
class RearrangeOddsEvens{
    static void rearrangeEvenOdd(Node head){
        if(head==null || head.next==null){
            return ;
        }
        Node odd=head;
        Node even=head.next;
        Node evenHead=head.next;
        while(even !=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
    }
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RearrangeOddsEvens rearrange=new RearrangeOddsEvens();;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node current=head;
        for(int i=1;i<n;i++){
            current.next=new Node(sc.nextInt());
            current=current.next;
        }
        rearrange.rearrangeEvenOdd(head);
        rearrange.printList(head);
    }
}

