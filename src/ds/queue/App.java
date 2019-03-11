package ds.queue;

public class App {

    public static void main(String[] args){
        Queue myQueue = new Queue(5);
        myQueue.insert(10l);
	myQueue.insert(20l);
	myQueue.insert(30l);
	myQueue.insert(40l);
	myQueue.insert(50l);
	myQueue.insert(60l);
	myQueue.viewQueue();
	System.out.println(myQueue.remove());
	System.out.println(myQueue.remove());
	myQueue.insert(60l);
	myQueue.viewQueue();




    }
}
