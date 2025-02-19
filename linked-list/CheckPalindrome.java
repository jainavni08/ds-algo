class Node{
    Node next;
    int data;
    Node(int data){
        this.data = data;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
public class CheckPalindrome {
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        Node front = null;
        while(temp != null && temp.next != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        temp.next = prev;
        return temp;
    }
    public static Node create(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data  + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static boolean check(Node head){
        if(head.next == null){
            return true;
        }
        Node middle = findMiddle(head);
        Node newHead = reverse(middle.next);
        Node first = head;
        Node second = newHead;
        while(second != null){
            if(first.data != second.data){
                newHead = reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        newHead = reverse(newHead);
        return true;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,3,2,1,3,2};
        Node head = create(arr);
        print(head);
        System.out.println(check(head));
        print(head);
    }

}
