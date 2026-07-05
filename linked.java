//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class linked {
//    Node head;
//
//    void insert(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//    }
//
//    int countNodes() {
//        int count = 0;
//        Node temp = head;
//
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//
//        return count;
//    }
//
//
//    void removeDuplicates() {
//        Node current = head;
//
//        while (current != null) {
//            Node temp = current;
//
//            while (temp.next != null) {
//                if (temp.next.data == current.data) {
//                    temp.next = temp.next.next; // remove duplicate
//                } else {
//                    temp = temp.next;
//                }
//            }
//
//            current = current.next;
//        }
//    }
//
//
//    void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//
//    public static void main(String[] args) {
//        linked list = new linked();
//
//        list.insert(1);
//        list.insert(2);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(3);
//
//        System.out.println("Original List:");
//        list.display();
//
//        System.out.println("Number of Nodes: " + list.countNodes());
//
//        list.removeDuplicates();
//
//        System.out.println("After Removing Duplicates:");
//        list.display();
//    }
//}