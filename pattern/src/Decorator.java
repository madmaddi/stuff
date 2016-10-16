import decorator.*;

public class Decorator {

	public static void main(String[] args) {
		
		Gericht gericht = new Salat(new Pommes(new Tofu()));
		
		System.out.println(
				"Gesamt: " + gericht.getPreis()
				);
		
		System.out.println(
				"Gesamt: " +  new Salat(new Pommes(new Schnitzel())).getPreis()
				);
		
		System.out.println(
				"Gesamt: " + new Salat(new Salat(new Pommes(new Schnitzel()))).getPreis()
				);
		
		
	}

}
