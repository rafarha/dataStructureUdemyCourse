package ds.circularLinkedList;

public class Node {
    private int data;

    private Node next;

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
