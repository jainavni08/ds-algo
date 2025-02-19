
class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        this.val = data;
    }
    ListNode(int data,ListNode next){
        this.val = data;
        this.next = next;
    }
}
public class Add1 {
    public static ListNode create(int []arr){
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i = 1;i<arr.length;i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val  + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode front = null;
        ListNode prev = null;
        while(curr != null && curr.next != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        curr.next = prev;
        return curr;
    }


    public static ListNode add(ListNode head){
        ListNode reversed = reverse(head);
        ListNode temp = reversed;
        int carry = 1;
        int sum = 0;
        ListNode prev = null;
        while(temp != null){
           // System.out.println("sum" + sum + "carry" + carry);
            if(carry == 0){
                break;
            }
            sum = temp.val;
            //System.out.println("node " +temp + " current sum" + sum + " carry " + carry);
            sum = sum + carry;
            temp.val = sum%10;
            carry = sum/10;
            prev = temp;
            temp = temp.next;
            
        }
        if(carry == 1){
            ListNode newNode = new ListNode(carry);
            prev.next = newNode;
        }
        head = reverse(reversed);
        return head;
    }
    public static void main(String[] args) {
        int []arr = {7,9,9,9,9};
        ListNode head = create(arr);
        print(head);
        head = add(head);
        print(head);
    }
}
