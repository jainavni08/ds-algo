class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
public class convertArr2LL {
    public static Node createLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ; i <arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp; 
        }
        return head;
    }

    public static void printLL(Node head){
        Node mover = head;
        while(mover != null){
            System.out.println(mover.data + " " + mover.next);
            mover = mover.next;
        }
    }

    public static void main(String []args){
        int [] arr= {1,2,3};
        Node head = createLL(arr);
        printLL(head);
    }
}
