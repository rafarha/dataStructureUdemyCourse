package ds.circularLinkedList;

public class App {

    public static void main(String [] args){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(10);
        circularLinkedList.insertFirst(20);
        circularLinkedList.insertFirst(30);
        circularLinkedList.insertFirst(40);
        circularLinkedList.insertFirst(50);
        circularLinkedList.insertLast(60);
        circularLinkedList.insertLast(100);
        circularLinkedList.insertLast(200);
        circularLinkedList.insertFirst(300);


        circularLinkedList.displayLinkedList();
        circularLinkedList.deleteFirst();
        circularLinkedList.displayLinkedList();


    }
}
