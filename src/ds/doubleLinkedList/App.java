package ds.doubleLinkedList;

public class App {

    public static void main(String[] args){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertFirst(10);
        doubleLinkedList.insertFirst(20);
        doubleLinkedList.insertFirst(30);
        doubleLinkedList.insertFirst(40);
        doubleLinkedList.insertFirst(50);
        doubleLinkedList.insertFirst(60);
        doubleLinkedList.insertFirst(70);

//insert last
        doubleLinkedList.insertLast(80);
        doubleLinkedList.insertLast(90);
        doubleLinkedList.insertLast(100);
        doubleLinkedList.displayLinkedList();
        doubleLinkedList.deleteFirst();
        doubleLinkedList.deleteFirst();
        doubleLinkedList.displayLinkedList();
        doubleLinkedList.deleteLast();
        doubleLinkedList.deleteLast();

        doubleLinkedList.displayLinkedList();
        doubleLinkedList.insetAfter(30, 999);
        doubleLinkedList.displayLinkedList();

        doubleLinkedList.insetAfter(80, 100);
        doubleLinkedList.displayLinkedList();

        doubleLinkedList.insetAfter(50, 200);
        doubleLinkedList.displayLinkedList();

        doubleLinkedList.deleteKey(999);
        doubleLinkedList.displayLinkedList();

        doubleLinkedList.deleteKey(80);
        doubleLinkedList.displayLinkedList();

        doubleLinkedList.deleteKey(50);
        doubleLinkedList.displayLinkedList();

        doubleLinkedList.deleteKey(100);
        doubleLinkedList.displayLinkedList();


    }
}
