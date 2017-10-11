package linkedList;

public class LinkedList {
	
	Node start_Node = null;
	Node last_Node = null;
	Node pos_Node = null;
	int totalNodes = 0;    // just to keep track of total element
	
	public void addAtstart(int x){
	
		Node temp = new Node(x);
		temp.next = start_Node;
		start_Node = temp;
	}
	
//	// add new element at the end of linked list
	public void addAtEnd(int x){
		Node temp = new Node(x);
		last_Node = start_Node;

		while(last_Node.next != null){
			last_Node = last_Node.next;
		}
		last_Node.next = temp;
	}
	
	
//	// add element at required position
	public void addAtPosition(int x, int pos){
		Node previous = null;
		Node temp = new Node(x);
		
		pos_Node = start_Node;
		for (int i = 1; i < pos; i++) {
			previous = pos_Node;     // using its next we will be able to point it out to our new node
			pos_Node = pos_Node.next;
		}
		previous.next = temp;
		temp.next = pos_Node;
	
	}

//	// remove element from the start of the list
	public void removeAtStart(){
		if (start_Node == null) {
			// do nothing b/c nothing is to remove from the start
		}
		else
			start_Node= start_Node.next;
	
	}
	
//	// remove last element from the list
	public void removeAtEnd(){
		last_Node = start_Node;
		
		while(last_Node.next.next != null){
			last_Node = last_Node.next;
		}
		last_Node.next = null;
		
	}
	
//	// remove element from the required position
	public void removeAtPosition(int pos){
		Node x = null;
		
		pos_Node = start_Node;
		for (int i = 1; i < pos; i++) {
			x = pos_Node;
			pos_Node = pos_Node.next;
		}
		x.next = pos_Node.next;
	}


//	// return true if list is empty and vice versa
	public boolean isEmpty(){
		
		if (start_Node == null) {
			return true;
		}
		else 
			return false;
	
	}
//	
//	// displays the content of required list
	
	public void search(int index){
		if (index == 1) {
			System.out.println("Content of List " + index + " is " + start_Node.data);
		}
		else{
			Node temp = start_Node;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			System.out.println("Content of List " + index + " is " + temp.data);
		}
	}
	
	// displays the content of whole linked list
	
	public void display(){
		
		Node temp = start_Node;
		if (temp.equals(null)) {
			System.out.println("Nothing to show");
		}
		else{
			System.out.println(temp.data);
			while (temp.next!=null) {
				temp = temp.next;
				System.out.println(temp.data);		
			}
		}
	}
	
	
	
}
