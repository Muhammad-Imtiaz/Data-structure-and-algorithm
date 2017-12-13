// UOB: 15026420
public class RunApp {

	public static void main(String[] args) {
		KeysGeneration keyObject = new KeysGeneration();
		keyObject.generateKeys();
		keyObject.writingTraceToFile();

	}

}
