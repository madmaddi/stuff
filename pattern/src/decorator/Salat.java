package decorator;

public class Salat extends Beilage{

	private int price = 4;
	public Salat(Gericht gericht) {
		super(gericht);
		// TODO Auto-generated constructor stub
	}

	public int getPreis(){
		this.druckeBeschreibung();
		return gericht.getPreis() + this.price;
	}
	
	public void druckeBeschreibung(){
		System.out.println(this.description() + " Salat" + this.printPrice(this.price));
	}
}
