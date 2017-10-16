package stack;

public class StackImplementation {
	
	Node end;
	
	// Push an element into the stack and add it at the end 
	public void push(String name, int age){
		Node temp = new Node(name, age);
		temp.next = end;
		end = temp;
	}
	
	//pop out an element from the stack by using stack principle FILO
	public void pop(){

		while(end.next != null){
			System.out.println("Name = " + end.name + "   Age = " + end.age);
			end = end.next;
			if (end.next == null) {
				System.out.println("Name = " + end.name + "   Age = " + end.age);
			}
		}
		end = null;
	}
	
	
	// return true if stack is empty and vice versa
	public boolean isEmpty(){
		if (end == null) {
			return true;
		}
		else
			return false;
	}
	
}
