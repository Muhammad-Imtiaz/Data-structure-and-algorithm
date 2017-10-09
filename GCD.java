
public class GCD {

	public static void main(String[] args) {
		GCD gcd = new GCD();
		
		System.out.println("GCD by iteration " + gcd.gcdItrative(2, 15));
		System.out.println("GCD by recursion " + gcd.gcdItrative(2, 15));
		
		
		// it checks whether two integers are relatively prime or not
		if(gcd.gcdItrative(2, 15) == 1){
			System.out.println("Two integers are relatively prime");
		}
	}

	// GCD by iteration
	private int gcdItrative(int i, int j) {
		
		for(int counter = j; counter >= 2; counter--){
			if((i%counter == 0) && (j%counter == 0)){
				return counter;
			}
		}
		return 1;
	}

	// GCD by recursion
	private int gcdRecursive(int i, int j) {
		if(i%j == 0){
			return j;
		}
		else
			return gcdRecursive(j, i%j);
	}

}
