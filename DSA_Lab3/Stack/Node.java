package stack;

public class Node {
	String name;
	int age;
	Node next;

	public Node() {
		name = null;
		age = 0;
		next = null;
	}

	public Node(String n, int a) {
		name = n;
		age = a;
		next = null;
	}

}
