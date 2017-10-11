package linkedList;

public class linkListDriver {

	public static void main(String[] args) {
		
		// Linked list object to use its methods
		LinkedList list = new LinkedList();
	
		
		// Manually add 5 nodes on the start of the list
		for (int i = 1; i <= 5; i++) {
			list.addAtstart(i*5);
		}
		
		// displaying all 5 nodes from the linked list by using display method
		System.out.println("Displaying content of 5 nodes");
		list.display();
		
		// adding node on the end of the list
		System.out.println("\n Adding node at end");
		list.addAtEnd(35);
		// Displaying contents of 6 nodes
		System.out.println("Displaying content of 6 nodes \n\n");
		list.display();
		
		// Adding node on 3 position of the list
		System.out.println("\nAdding node at 3 position");
		list.addAtPosition(100, 3);
		// Displaying nodes of the list
		list.display();
		
		// Removing node from the start of the list
		System.out.println("\nRemoving node From the start");
		list.removeAtStart();
		// Displaying all nodes while fist node is removed
		list.display();
		
		// Removing node at the end of the list
		System.out.println("\nRemoving node at the end of the list");
		list.removeAtEnd();
		// Displaying all nodes while fist node is removed
		list.display();
		
		// Removing node from at position 3 of the list
		System.out.println("\nRemoving node at position 3 of the list");
		list.removeAtPosition(3);
		// Displaying all nodes while fist node is removed
		list.display();
		
		// searching 3 element from the linked list
		list.search(5);
		
		//Checking if list is empty or not
		if (list.isEmpty() == true) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
		}
		
	}

}
