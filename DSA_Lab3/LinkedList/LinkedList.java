package linkedList;

public class LinkedList {
	Node head;
	Node end;

	public LinkedList(){
		head = null;
	}

	// add node at start
	public void addAtStart(Node x) {
		x.next = head;
		head = x;
	}

	// add node at end
	public void addAtEnd(Node x) {
		end = head;

		while (end.next != null) {
			end = end.next;
		}
		end.next = x;
	}

	// display all nodes of the list
	public void display() {
		Node temp = head;
		if (temp.equals(null)) {
			System.out.println("Nothing to show");
		} else {
			System.out.println(temp.name + "		" + temp.age);
			while (temp.next != null) {
				temp = temp.next;
				System.out.println(temp.name + "		" + temp.age);
			}
		}
	}

	// deletes node from the start of the list
	public void deleteFromStart() {
		if (head == null) {
			// do nothing b/c nothing is to remove from the start
		} else
			head = head.next;
	}

	// deletes node from the end of the list
	public void deleteFromEnd() {
		Node end = head;

		while (end.next.next != null) {
			end = end.next;
		}
		end.next = null;

	}

	// search node on the basis of name and return reference of node
	public Node search(String n) {
		Node temp = head;
		if (head.name.equals(n)) {
			return temp;
		} else {
			while (temp.next != null) {
				temp = temp.next;
				if (temp.name.equals(n)) {
					return temp;
				}
			}
			return null;
		}
	}

	// it checks whether list is empty or not
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	// it returns the total number of the elements of the array
	public int size() {
		Node temp = head;
		int counter = 1;
		while (temp.next != null) {
			temp = temp.next;
			counter++;
		}
		return counter;
	}

}
