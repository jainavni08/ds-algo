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
public class InsertNodeDLL {
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
    
    public static Node insert(Node head , int k , int data){ //insert data after kth node
        if(k == 0){ //insert before head
            Node temp = new Node(data);
            temp.next = head;
            head.prev = temp;
            return temp;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        if(temp != null){
            System.out.println("node with data " + temp.data);
            Node front = temp.next;
            Node newNode = new Node(data,front,temp);
            if(front != null){
                front.prev = newNode;
            }
            temp.next = newNode;
        }else{
            System.out.println("k is bigger than length");
        }
        return head;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = create(arr);
        print(head);
        head = insert(head, 6, 13);
        print(head);
    }
}
