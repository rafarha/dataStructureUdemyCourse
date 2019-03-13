package ds.doubleLinkedList;

public class DoubleLinkedList {

    private Node first;

    private Node last;

    public DoubleLinkedList() {
    }

    public Node deleteFirst() {
	Node temp = first;
	if (first.getNext() == null) {//Verify if list is only one element
	    last = null;
	} else {
	    first.getNext().setPrevious(null);
	}
	first = first.getNext();
	return temp;
    }

    public Node deleteLast() {
	Node temp = last;
	if (first.getNext() == null) {//Verify if list is only one element
	    first = null;
	} else {
	    last.getPrevious().setNext(null);
	}
	last = last.getPrevious();
	return temp;
    }

    public void displayLinkedList() {
	Node current = first;
	StringBuilder strRetorno = new StringBuilder();
	strRetorno.append("[");
	while (current.getNext() != null) {
	    strRetorno.append(current.getData() + " ");
	    current = current.getNext();

	}
	strRetorno.append(current.getData() + " ");
	strRetorno.append("]");
	System.out.println(strRetorno);
    }

    public void insertFirst(int pData) {
	Node newNode = new Node();
	newNode.setData(pData);
	if (isEmpty()) {
	    last = newNode;
	} else {
	    newNode.setNext(first);
	    first.setPrevious(newNode);
	}
	first = newNode;

    }

    public void insertLast(int pData) {
	Node newNode = new Node();
	newNode.setData(pData);
	if (isEmpty()) {
	    first = newNode;
	} else {
	    newNode.setPrevious(last);
	    last.setNext(newNode);
	}
	last = newNode;
    }

    public boolean isEmpty() {
	return first == null;
    }

}
