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

public class ReverseLLRecrusive{
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newNode = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }

    public static ListNode create(int []arr){
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i = 1 ;i < arr.length ;i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        ListNode head = create(arr);
        print(head);
        head = reverse(head);
        print(head);
    }
}