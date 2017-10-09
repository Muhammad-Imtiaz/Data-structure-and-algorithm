
public class SwapValues {
	public static void main(String[] args) {
		int i = 14;
		int j = 15;
		int temp;
		System.out.println("Orignal values of i and j "+ i + " " + j);
		
		temp = i;
		i = j;
		j = temp;
		
		System.out.println("Swaped values of i and j "+ i + " " + j);
	}
}
