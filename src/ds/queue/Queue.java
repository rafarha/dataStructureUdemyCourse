package ds.queue;

public class Queue {

    private int front;

    private int maxSize;

    private int nElements;

    private Long[] queueData;

    private int rear;

    public Queue(final int pMaxSize) {
	maxSize = pMaxSize;
	queueData = new Long[pMaxSize];
	nElements = 0;
	front = 0;
	rear = -1;
    }

    public void insert(Long pElement) {
	if (isFull()) {
	    System.out.println("Queue is already full");
	    return;
	}
	nElements++;
	rear++;
	queueData[rear] = pElement;
    }

    public boolean isEmpty() {
	return nElements == 0;
    }

    public boolean isFull() {
	return (nElements == maxSize);
    }

    public Long remove() {
	if (isEmpty()) {
	    System.out.println("Queue is already empty");
	    return queueData[rear];
	}
	Long elementRemoved = queueData[front];
	front++;
	nElements--;
	if(rear+1 == maxSize){
	    rear = front -1;
	}
	return elementRemoved;
    }

    public void viewQueue() {
	StringBuilder strReturn = new StringBuilder();
	strReturn.append("[");
	for (int i = front; i < maxSize; i++) {
	    strReturn.append(queueData[i]).append(" ");
	}
	strReturn.append("]");
	System.out.println(strReturn);
    }
}
