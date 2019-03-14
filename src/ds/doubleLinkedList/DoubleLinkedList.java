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
    public boolean insetAfter(int pKey, int pData){
        Node current = first;
        while (current.getData()!= pKey){
            current = current.getNext();
            if(current ==null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.setData(pData);
        if(current == last){
            newNode.setPrevious(last);
            last = newNode;
        }else{
            newNode.setNext(current.getNext());
            newNode.setPrevious(current);
            current.getNext().setPrevious(newNode);
        }
        current.setNext(newNode);
        return true;
    }
    public Node deleteKey(int pKey){
        Node temp;
        Node current = first;
        while (current.getData()!=pKey){
            current = current.getNext();
            if(current == null){
                System.out.println("Não foi encontrado um node com a key: "+pKey);
                return null;
            }
        }
        temp = current;
        if(current ==first){
            first = current.getNext();
        }else {
            current.getPrevious().setNext(current.getNext());



        }
        if(current == last){
            last = current.getPrevious();
        }else{
            current.getNext().setPrevious(current.getPrevious());
        }

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
