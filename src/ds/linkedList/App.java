package ds.linkedList;

public class App {
    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.setData(100);
	Node nodeB = new Node();
	nodeB.setData(200);
	Node nodeC = new Node();
	nodeC.setData(300);
	Node nodeD = new Node();
	nodeD.setData(1);
	nodeA.setNext(nodeB);
	nodeB.setNext(nodeC);
	nodeC.setNext(nodeD);
	nodeA.displayLinkedList();
    }
}
