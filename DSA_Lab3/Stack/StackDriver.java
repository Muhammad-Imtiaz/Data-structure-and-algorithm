package stack;

public class StackDriver {

	public static void main(String[] args) {
		
		// StackImplementation object
		StackImplementation myStack = new StackImplementation();
		
		// checking whether stack is empty or not
		if (myStack.isEmpty() == true) {
			System.out.println("Stack is empty :)\n");
		}
		else {
			System.out.println("Stack is not empty!!!\n");
		}
		
		// push five nodes into the stack
		for (int i = 1; i <= 10; i++) {
			myStack.push("Name" + i, i*10);
		}
		
		
		// checking whether stack is empty or not
		if (myStack.isEmpty() == true) {
			System.out.println("Stack is empty :)\n");
		}
		else {
			System.out.println("Stack is not empty!!!\n");
		}
		
		// Poping off all element from the stack
		myStack.pop();
		
		// checking whether stack is empty or not
		if (myStack.isEmpty() == true) {
			System.out.println("\nStack is empty :)\n");
		}
		else {
			System.out.println("\nStack is not empty!!!\n");
		}
	}

}
