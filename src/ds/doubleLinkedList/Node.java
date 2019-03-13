package ds.doubleLinkedList;

public class Node {
    private int data;

    private Node next;

    private Node previous;

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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
