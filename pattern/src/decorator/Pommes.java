package decorator;

public class Pommes extends Beilage{

	private int price = 2;
	public Pommes(Gericht gericht) {
		super(gericht);
		// TODO Auto-generated constructor stub
	}

	public int getPreis(){
		this.druckeBeschreibung();
		return gericht.getPreis() + this.price;
	}
	
	public void druckeBeschreibung(){
		System.out.println(this.description() + " Pommes" + this.printPrice(this.price));
	}
}
