package decorator;

public abstract class Beilage implements Gericht {

	protected Gericht gericht;
	
	public Beilage(Gericht gericht){
		this.gericht = gericht;
	}
	
	public String description(){
		return "Ich bin die Beilage";
	}
	
	public String printPrice(int p) {
		return " und koste " + p + " EUR";
	}
}
