import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Sort0s1s2s{
    static Node segregate(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        int count0=0;
        int count1=0;
        int count2=0;
        while(temp!=null){
            if(temp.data==0){
                count0++;
            }else if(temp.data==1){
                count1++;
            }else{
                count2++;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(count0>0){
                temp.data=0;
                count0--;
            }else if(count1>0){
                temp.data=1;
                count1--;
            }else{
                temp.data=2;
                count2--;
            }
            temp=temp.next;
        }
        return head;
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
        Sort0s1s2s ob=new Sort0s1s2s();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node current=head;
        for(int i=1;i<n;i++){
            current.next=new Node(sc.nextInt());
            current=current.next;
        }
        ob.segregate(head);
        ob.printList(head);
    }
}