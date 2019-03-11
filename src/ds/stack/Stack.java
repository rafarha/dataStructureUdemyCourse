package ds.stack;

import com.sun.xml.internal.ws.util.ASCIIUtility;

import java.util.Arrays;

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
        if(isEmpty()){
            System.out.println("The stack is empty");
            Character o = null;
            return o;
        }else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public void push(char pChar) {
        if(isFull()){
            System.out.println("Stack is already full");
        }else{
            top++;
            this.stackArray[top] = pChar;
        }
    }

}
