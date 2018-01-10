//package singlylinkedlist;

public class Node {
	
	public int data;
	//initialize the next to find the last
	public Node next;
 
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void print() {
		System.out.println(this.data);
	}
	
	//getter
	public int getData() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}
	
	//setter
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}