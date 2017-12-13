//UOB: 15026420

// node class 
public class Node {

	long data;                        // contain data
	Node next;                       // holds next node address
	Node previous;                   // holds previous node address

	// constructor initiating fields to null
	public Node() {
		this.data = 0;
		this.next = null;
		this.previous = null;
	}

	// constructor initiating data to passed value
	public Node(long data2) {
		this.data = data2;
		this.next = null;
		this.previous = null;
	}

}
