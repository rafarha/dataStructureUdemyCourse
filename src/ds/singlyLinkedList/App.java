package ds.singlyLinkedList;

public class App {
    public static void main(String[] args) {
	SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
	singlyLinkedList.insertFirst(10);
	singlyLinkedList.insertFirst(20);
	singlyLinkedList.insertFirst(30);
	singlyLinkedList.displayLinkedList();
	singlyLinkedList.insertLast(40);
	singlyLinkedList.displayLinkedList();
	singlyLinkedList.insertFirst(50);
	singlyLinkedList.displayLinkedList();
    }
}
