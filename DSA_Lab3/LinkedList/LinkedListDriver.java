package linkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		// LinkedList object
		LinkedList myList = new LinkedList();
		
		//Displaying list when list is empty
		System.out.println("Displaying list at the start");
		// returns true if list is empty and vice versa
		if (myList.isEmpty() == true) {
			System.out.println("\nList is no more :)\n\n");
		}
		else
			System.out.println("\nList exist !!!");
		
		
		
		// adding five nodes to the start of the list
		System.out.println("Adding five nodes at the start of the list\n");
		for (int i = 1; i <= 5; i++) {
			Node temp = new Node("Name" + i, i*5+25);
			myList.addAtStart(temp);
		}
		
		
		// Displaying all five nodes from the list
		System.out.println("\nDisplaying five nodes of the list\n");
		myList.display();
		
		// Adding five nodes at the end of the list
		System.out.println("\n\nAdding five nodes at the end of the list\n");
		for (int i = 5; i >= 1; i--) {
			Node temp = new Node("Name" + i, i*5);
			myList.addAtEnd(temp);
		}
		
		
		// Displaying all ten nodes from the list
		System.out.println("\nDisplaying ten nodes of the list\n");
		myList.display();
		
		//Removing three nodes from the start
		System.out.println("\nRemoving first three nodes from the start\n");
		for (int i = 1; i <= 3; i++) {
			myList.deleteFromStart();
		}
		
		// displaying 7 nodes of the list
		System.out.println("Displaying seven nodes from the list\n\n");
		myList.display();
		
		//Removing three nodes from the start
		System.out.println("\nRemoving last three nodes from the end\n");
		for (int i = 1; i <= 3; i++) {
			myList.deleteFromEnd();
		}
		
		// displaying 7 nodes of the list
		System.out.println("Displaying four nodes from the list\n\n");
		myList.display();
		
		//Searching 5th node from the list
		System.out.println("\n\nSearching 5th node from the list with the name 'Name5'");
		Node temp = myList.search("Name5");
		if (temp != null) {
			System.out.println("Name = " + temp.name + "   Age = " + temp.age);
		}
		else {
			System.out.println("\n\nNode does not exist with this name :(");
		}
		
		
		// displaying the total elements of the list
		System.out.println("\n\nTotal element of the list are " + myList.size());
		
		// returns true if list is empty and vice versa
		if (myList.isEmpty() == true) {
			System.out.println("\n\nList is no more :)\n\n");
		}
		else
			System.out.println("\n\nList exist !!!");
		
	
	
	}
	
}
