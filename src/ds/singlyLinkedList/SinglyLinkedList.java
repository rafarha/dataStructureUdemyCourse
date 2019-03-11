package ds.singlyLinkedList;

public class SinglyLinkedList {
    private Node first;

    private Node last;

    public SinglyLinkedList() {
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
	Node myNode = new Node();
	myNode.setData(pData);
	myNode.setNext(first);
	if (last ==null) {
	    last = first;
	}
	first = myNode;
    }

    public void insertLast(int pData) {
	Node myNode = new Node();
	myNode.setData(pData);
	last.setNext(myNode);
	last = myNode;
    }

    public boolean isEmpty() {
	return first == null;
    }
}
