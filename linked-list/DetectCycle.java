import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }

    // Method to create a linked list from user input
    public static Node createLinkedList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();

        if (n == 0) return null; // Empty list

        System.out.println("Enter the node values:");
        Node head = new Node(scanner.nextInt()); // First node
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(scanner.nextInt()); // Add new node
            temp = temp.next;
        }

        return head; // Return head of the linked list
    }
}

public class DetectCycle {
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Node head = Node.createLinkedList();
        boolean hasLoop = hasCycle(head);

        System.out.println(hasLoop ? "true" : "false");
    }
}
