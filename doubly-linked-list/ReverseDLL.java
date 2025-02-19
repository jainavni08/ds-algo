class Node{
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data = data;
    }
    Node(int data,Node next,Node prev){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
public class ReverseDLL {
    public static Node create(int []arr){
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i],null,curr);
            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node curr = head;
        Node last = null;
        while(curr != null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            curr = curr.prev;
        }
        return last.prev;
    }
    public static void print(Node head){
        Node temp =  head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = create(arr);
        print(head);
        Node newhead = reverse(head);
        System.out.println("after reversal:");
        print(newhead);
    }
    
}
