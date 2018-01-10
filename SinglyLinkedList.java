//package singlylinkedlist;

public class SinglyLinkedList {
    public Node first;

    //Create empty list
    public SinglyLinkedList() {
        this.first = null;
    }

    //print list data if node's next is not null
    public void printList() {
        Node first = this.first;
        while (first != null) {
            first.print();
            first = first.getNext();
        }
    }

    public void addToBeginning(int data) {
        //if the list is an empty list, 
        //initialize the first node and break the method
        if (this.first == null) {
            this.first = new Node(data);
        } else {
            //if the list is not empty, append
            Node first = new Node(data);
            first.setNext(this.first);
            this.first = first;
        }
    }

    public void insertAfterTheNode(Node node, int data) {
        if (node == null) {
            System.out.println(
                    "node null ise araya ekleme yapılamaz. node null ise next(bir sonraki node yoktur) yoktur. Yada Liste boş bir listedir");
        } else {
            Node inserted = new Node(data);
            inserted.setNext(node.getNext());
            node.setNext(inserted);
        }
    }

    public void insertBeforeTheNode(Node node, int data) {
        if (node == null) {
            System.out.println(
                    "Node null ise öncesine ekleme yapılamaz. Bu node sonuncu node tarafından refere edilen node olabilir");
        } else {
            Node before = this.first;
            while (before != null) {
                if (before.getNext() == node)
                    break;
                else
                    before = before.getNext();
            }

            Node inserted = new Node(data);
            inserted.setNext(node);
            before.setNext(inserted);
        }
    }

    public void addToEnd(int data) {
        //if the list is an empty list, 
        //initialize the first node and break the method
        if (this.first == null) {
            this.first = new Node(data);
        } else {
            Node last = this.first;
            //Find the last node
            while (last.getNext() != null) {
                last = last.getNext();
            }
            //set the last node
            last.setNext(new Node(data));
        }
    }

    public void deleteTheFirstNode() {
        this.first = first.getNext();
    }

    public void deleteTheNode(Node node) {
        //if a node is null, you can't delete it
        //before -> node -> after
        if (node == null) {
            System.out.println("null olan node zaten yoktur. silinemez");
        } else {
            Node before = this.first;
            Node after = node.getNext();
            //find the before
            while (before != null) {
                if (before.getNext() == node) {
                    break;
                } else {
                    before = before.getNext();
                }
            }
            //before -> after so node won't be referenced by the before
            before.setNext(after);
            node = null;
        }
    }

    public Node reverseLinkedList(Node node) {

        Node before = null;
        Node current = node;
        Node after = null;
        while (current != null) {
            after = current.getNext();
            current.setNext(before);
            before = current;
            current = after;
        }
        node = before;
        return node;

    }

    //length of linked list likes array length last one is null
    //Indexing starts with zero
    public void lengthOfLinkedList() {
        Node first = this.first;
        int count = 0;
        while (first != null) {
            count++;
            first = first.getNext();
        }
        System.out.println("length of linked list = " + count);
    }

    //find the last node and return
    public Node findLastNode() {
        Node last = this.first;
        while (last.getNext() != null)
            last = last.getNext();
        return last;
    }

}