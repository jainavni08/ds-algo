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
public class DeleteNode {
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
    
        public static void print(Node head){
            Node temp =  head;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
        
        public static Node delete(Node head , int k){ //function to delete Node 
            Node temp = head;
            int count = 0;
            if(k == 1){
                head = head.next;
                head.prev = null;
                return head;
            }
            while(temp != null ){
                count++;
                if (count == k) {
                    break;
                }
                temp = temp.next;
            }
            if(temp != null){
            Node back = temp.prev;
            Node front = temp.next;
            back.next = front;
            front.prev = back;
            temp.prev = null;
            temp.next = null;
            }
            
            return head;
        }
        public static void main(String[] args) {
            int []arr = {1,2,3,4,5};
            Node head = create(arr);
            print(head);
            head = delete(head, 6);
            print(head);
        }
    }

