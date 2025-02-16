import java.util.*;
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
public class Sort012 {
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
    public static ListNode sort(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode temp = head;
        while(temp != null ){
            if(temp.val == 0){
               // System.out.println("current val is zero");
                zero.next = temp;
                zero = temp;
            }else if(temp.val == 1){
               // System.out.println("current val is one");
                one.next = temp;
                one = temp;
            }else{
               // System.out.println("current val is two");
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
       if(oneHead.next != null){
        zero.next = oneHead.next;
       }else{
        zero.next = twoHead.next;
       }
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,1,2,0,1,0};
        ListNode head = create(arr);
        print(head);
        ListNode newHead = sort(head);
        System.out.println("sorted list : ");
        print(newHead);

    }
}
