import java.util.*;
class Solution{
    public static class Node{
        int data;
        Node next;
        Node(int x , Node y){
            this.data = x;
            this.next = y;
        }
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    public static void travel(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node construct(){
        System.out.println("Enter element:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node head = new Node(x);
        Node temp = head;
        while(true){
            System.out.println("Enter element:");
            int y = sc.nextInt();
            if(y == -1){
                break;
            }else{
                temp.next = new Node(y);
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main (String []args){
        Node head = construct();
        travel(head);
    }
}