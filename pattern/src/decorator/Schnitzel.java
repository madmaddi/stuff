package decorator;

public class Schnitzel implements Gericht{
	
	private int price = 15;
	
	public int getPreis()
	{
		this.druckeBeschreibung();
		return this.price;
	}
	
	
	public void druckeBeschreibung(){
		System.out.println("Ich bin Schnitzel und koste " + this.price + " EUR");
	}
}
