
public class Rel_Prime_Probibility {

	public static void main(String[] args) {
		Rel_Prime_Probibility rel = new Rel_Prime_Probibility();
		
		System.out.println("Probibility of relative prime between (1-1000) " 
		+ rel.probibility());
		
	}
	
	
	// it will return probability of two randomly chosen numbers between 1 and 1000 
	private double probibility(){
		int prob_counter = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= 1000; j++) {
				if(gcdRecursive(i, j) == 1){
					prob_counter++;
				}
			}
		}
		return prob_counter / 1000000.0;
	}
	
	
	// it will give gcd of both numbers
	private int gcdRecursive(int i, int j) {
		if(i%j == 0){
			return j;
		}
		else
			return gcdRecursive(j, i%j);
	}

}
