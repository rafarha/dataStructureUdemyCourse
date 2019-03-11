package ds.stack;

public class App {

    public static void main(String[] args) {
//	Stack myStack = new Stack(5);
//	myStack.push("A".charAt(0));
//	myStack.push("B".charAt(0));
//	myStack.push("C".charAt(0));
//
//	System.out.println(myStack.peak());
		System.out.println(stringInverter("Rafael Henrique Alves"));


    }

    public static String stringInverter(String pString){
		int tamanhoString = pString.length();
		Stack myStack = new Stack(tamanhoString);
		StringBuffer strSaida = new StringBuffer();
    	for(int i =0; i<tamanhoString; i++){
    		myStack.push(pString.charAt(i));
		}
    	String result = "";
    	while (!myStack.isEmpty()){
    		result = result + myStack.pop();
		}
    	return result;
	}
}
