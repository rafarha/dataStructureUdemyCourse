package ds.linkedList;

public class Node {
    private int data;

    private Node next;

    public void displayLinkedList() {
	Node current = this;
	System.out.println("[");
	while (current.next != null) {
	    System.out.println(current.data + " ");
	    current = current.next;
	}
	System.out.println(current.data + " ");
	System.out.println("]");
    }

    public int getData() {
	return data;
    }

    public Node getNext() {
	return next;
    }

    public void setData(final int pData) {
	data = pData;
    }

    public void setNext(final Node pNext) {
	next = pNext;
    }
}
