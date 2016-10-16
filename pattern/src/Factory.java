import factory.OpenOfficeFactory;

public class Factory {

	public static void main(String[] args) {
		// Apple
		OpenOfficeFactory soof = new OpenOfficeFactory();
		System.out.println(soof.holeApp("Textverarbeitung"));
		
		
	}

}
