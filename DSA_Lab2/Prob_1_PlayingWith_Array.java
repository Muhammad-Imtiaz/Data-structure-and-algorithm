package usingArray;

public class Prob_1_PlayingWith_Array {
	
	int array[] = new int[100];
	// informs total elements in the array
	int counter = 0;
	
	void addAtStart(int	x){
		for (int i = counter; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = x;
		counter++;
	}
	
	void addAtEnd(int x){
		if (isFull() != true) {
			array[counter] = x;
			counter++;
		}
		else
			System.out.println("Array is full");
	}

	void addAtPosition(int x, int pos){
		if (pos < counter ) {
			for (int i = counter; i > pos; i--) {
				array[i] = array[i-1];
			}
			array[pos] = x;
		}
		else{
			// do nothing
		}
	}
	
	boolean isFull(){
		if(array.length == counter){
			return true;
		}
		else 
			return false;
	}
	
	boolean isEmpty(){
		if (counter == 0) {
			return true;
		}
		else
			return false;
		
	}
	// it will just remove element from the start
	void removeAtStart(){
		for (int i = 0; i < counter - 1; i++) {
			array[i] = array[i+1];
		}
		counter--;
	}
	
	void removeAtEnd(){
		array[counter-1] = 0;
		counter--;
	}

	
	void removeAtPosition(int pos){
		for (int i = pos; i < counter ; i++) {
			array[pos] = array[pos + 1];
		}
		array[counter-1] = 0;
		counter--;
	}
	
	void display(){
		System.out.println("Values in Array");
		for (int i = 0; i < counter; i++) {
			System.out.print(array[i] +  " ");
		}
	}
	
	int	search(int x){
		for (int i = 0; i < counter; i++) {
			if (array[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
