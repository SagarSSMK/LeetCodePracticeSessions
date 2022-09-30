package linkedlist;

public class LinkedList {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data= d;
            next= null;
        }
    }

    public static LinkedList insert(LinkedList list, int data){

        Node new_node = new Node(data);

        if(list.head==null){
            list.head= new_node;
        }
        else {
            Node last = list.head;
            while (last.next!=null){
                last = last.next;
            }
            last.next= new_node;
        }

        return list;
    }

    public static void printList(LinkedList list){

        Node currNode = list.head;
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static int middleFastNode(LinkedList head){
        Node slow = head.head, fast= head.head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void printNode(Node head){
        while (head.next!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static int middleNode(LinkedList head){

        Node currNode = head.head;
        Node newCurrNode = head.head;
        int length=0;
        while (currNode!=null){
            length++;
            currNode = currNode.next;
        }

        int middleNodeToBePicked = 0;
        if(length%2==0) middleNodeToBePicked= length/2;
        else middleNodeToBePicked = length/2 +1;

        int count=0;
        int value =0;

        while (newCurrNode!=null){
            count++;
            if(count==middleNodeToBePicked)
                value = newCurrNode.data;
            newCurrNode = newCurrNode.next;
        }

        return value;
    }

    public static Node reverseLinkedList(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node p = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        insert(list,1);
        insert(list,2);
        insert(list,3);
        insert(list,4);
        insert(list,5);
        insert(list,6);
        insert(list,7);

  //      System.out.println(middleFastNode(list));
 //       System.out.println("Break ");
        Node newList = reverseLinkedList(list.head);
 //       printNode(newList);
    }
}
