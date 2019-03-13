package ds.doubleLinkedList;

public class DoubleLinkedList {

    private Node first;

    private Node last;

    public DoubleLinkedList() {
    }

    public void insertFirst(int pData){
        Node newNode = new Node();
        newNode.setData(pData);
        if(isEmpty()){
            last = newNode;
        }else{
            newNode.setNext(first);
            first.setPrevious(newNode);
        }
        first = newNode;

    }
    public void insertLast(int pData){
         Node newNode = new Node();
         newNode.setData(pData);
         if(isEmpty()){
             first = newNode;
         }else{
             newNode.setPrevious(last);
             last.setNext(newNode);
         }
         last = newNode;
    }
    public Node deleteFirst(){
        Node temp = first;
        first = first.getNext();
        first.setPrevious(null);
        return temp;
    }

    public Node deleteLast(){
        Node temp = last;
        last = last.getPrevious();
        last.setNext(null);
        return temp;
    }

    public boolean isEmpty(){
        return first == null;
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

}
