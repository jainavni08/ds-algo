
class ListNode {
     int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class InsertionOftwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
            //System.out.println(a.next + " "+ len);
            if(a  == null){
                a = headB;
            }else{
                a = a.next;
            }
            if(b == null){
                b = headA;
            }else{
                b = b.next;
            }
        }
       return a;
    }
    public static ListNode create(int []arr){
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i  = 1 ; i < arr.length ; i++ ){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(){ 
    }
    
}