
class Node{
    int val;
    Node next;
    Node(int data){
        this.val = data;
    }
    Node(int data,Node next){
        this.val = data;
        this.next = next;
    }
}
public class removeElement {
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
            System.out.print(mover.val + " ");
            mover = mover.next;
        }
    }
    public static Node removeElements(Node head, int val) {
        if(head == null) return head;
        while(head != null && head.val == val){
            head = head.next;
        }
        Node mover = head;
        while(mover != null && mover.next != null){
            if(mover.next.val == val ){
                mover.next = mover.next.next;
            }else{
            mover = mover.next;}
        }
        
        return head;
    }
    public static void main(String []args){
        int [] arr= {2,2,2,2,2};
        Node head = createLL(arr);
        printLL(head);
        System.out.println("after deletion");
        head = removeElements(head,2);
        printLL(head);
    }
}

