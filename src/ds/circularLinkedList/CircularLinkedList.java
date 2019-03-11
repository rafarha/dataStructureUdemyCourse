package ds.circularLinkedList;

public class CircularLinkedList {
    Node first;

    Node last;

    public CircularLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int pData){
        Node newNode = new Node();
        newNode.setData(pData);
        if(isEmpty()){
            this.last = newNode;
        }
        newNode.setNext(this.first);
        this.first = newNode;
    }

    public void insertLast(int pData){
        Node newNode = new Node();
        newNode.setData(pData);
        if(isEmpty()){
          this.first = newNode;
        }else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
    }

    public int deleteFirst(){
        int temp = this.first.getData();
        if(this.first.getNext()==null){
            last = null;
        }
        this.first = first.getNext();
        return temp;
    }

    public boolean isEmpty(){
        return this.first == null;
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
