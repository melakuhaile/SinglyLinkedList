//package singlylinkedlist;

public class ListTester {

    public static void main(String[] args) {

        SinglyLinkedList linked = new SinglyLinkedList();

        linked.first = new Node(5);
        Node second = new Node(8);
        Node third = new Node(2);

      
        linked.first.setNext(second);
        second.setNext(third);
        linked.printList();
        //linked.deleteTheFirstNode();
        System.out.println("--------");
        linked.printList();

        linked.first = linked.reverseLinkedList(linked.first);
        linked.printList();
        
        Node last = linked.findLastNode();
        System.out.println("The Last Data = " + last.getData());

    }
}