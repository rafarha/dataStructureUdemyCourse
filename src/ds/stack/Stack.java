package ds.stack;

public class Stack {

    private int maxSize;

    private char[] stackArray;

    private int top;

    public Stack(int pSizeStack) {
	this.stackArray = new char[pSizeStack];
	this.maxSize = pSizeStack;
	this.top = -1;
    }

    public boolean isEmpty() {
	return (this.top == -1);
    }

    public boolean isFull() {
	return (this.maxSize - 1 == top);
    }

    public char peak() {
	return this.stackArray[top];
    }

    public char pop() {
	int old_top = top;
	top--;
	return stackArray[old_top];
    }

    public void push(char pChar) {
	top++;
	this.stackArray[top] = pChar;
    }

}
