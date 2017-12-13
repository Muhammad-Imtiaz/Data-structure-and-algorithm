// UOB: 15026420

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class KeysGeneration {
	
	                              
	long keys[] = new long [15];                       //Array to store generated keys
	int uoB = 15026420;                               // my UOB
	Node head = null;                                 // holds address of list
	
	
	// returns nth fibonanci of passed number
	public long fibonanciNumber(long number) {

		if (number == 0) {                            // base case
			return 0;
		} 
		else if (number == 1) {                       // base case
			return 1;
		} 
		else {
			return fibonanciNumber(number - 1) + fibonanciNumber(number - 2);       // recursive case
																				
		}
	}

	
	/*  generates keys by calling fibonanci function
	 *  and takes modulous with UOB
	 */
	public void generateKeys(){
		for (int i = 0; i < keys.length; i++) {
			keys[i] = fibonanciNumber(35 + (i+1) ) % uoB;
		}
	}
	
	
	// pass keys to insert fn and write trace to file
	public void writingTraceToFile(){
		File traceFile = new File("TraceFile");
		try {
			PrintWriter output = new PrintWriter(traceFile);
			output.print("List Trace  ");
			for (int i = 0; i < keys.length; i++) {
				String trace = insertIntoDLL(keys[i]);
				System.out.print(trace);
				output.print(trace);
			}
			output.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error while connecting to file!!");
		}
		
	}
	
	
	
	//inserting keys into doubly link list
	public String insertIntoDLL(long data){
		
		Node temp = head;                                     // holds node address temporarily
		Node newNode = new Node(data);                        //creates a new node
		
		if (head == null) {
			head = newNode;
			return ("I" + newNode.data + "  ");
		}
		else if (newNode.data < head.data) {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
			return ("I" + newNode.data + "B" + head.next.data + "  ");
		}
		else {
			while (temp.next != null) {
				if (newNode.data > temp.data) {
					temp = temp.next;
				}
				else 
					break;
				
			} //ends loop
			if (newNode.data < temp.data) {                //checks where to insert node
				
				newNode.next = temp;
				newNode.previous = temp.previous;
				temp.previous = newNode;
				temp.previous.next = newNode;
				return ("I" + newNode.data + "A" + temp.previous.data + "B" + temp.data + "  ");
			}
			else{
				temp.next = newNode;
				newNode.previous = temp;
				temp = newNode;
				return ("I" + newNode.data + "A" + temp.data);
			}
		}
		
	}
	
	
}
