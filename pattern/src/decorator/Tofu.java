package decorator;

public class Tofu implements Gericht{
	
	private int price = 13;
	
	public int getPreis()
	{
		this.druckeBeschreibung();
		return this.price;
	}
	
	
	public void druckeBeschreibung(){
		System.out.println("Ich bin Tofu und koste " + this.price + " EUR");
	}
}
