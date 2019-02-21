package ds.stack;

public class App {

    public static void main(String[] args) {
	Stack myStack = new Stack(5);
	myStack.push("A".charAt(0));
	myStack.push("B".charAt(0));
	myStack.push("C".charAt(0));

	System.out.println(myStack.peak());

    }
}
