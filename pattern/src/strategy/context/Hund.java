package strategy.context;

import strategy.strategy.BellVerhalten;
import strategy.strategy.LaufVerhalten;
import strategy.strategy.LautBellen;
import strategy.strategy.SchnellLaufen;

public abstract class Hund implements BellVerhalten {
	BellVerhalten bellen = new LautBellen();// Default
	LaufVerhalten laufen = new SchnellLaufen();// Default
	
	public String name = "???";
	
	public Hund(String n) {
		this.name = n;
	}
	
	public void bellen() {
		this.explain();
		bellen.bellen();
	}
	
	public void laufen() {
		this.explain();
		laufen.laufen();
	}

	public void setBellen(BellVerhalten bellen) {
		this.bellen = bellen;
	}

	public void setLaufen(LaufVerhalten laufen) {
		this.laufen = laufen;
	}
	
	public void explain(){
		System.out.print(this.name + ": ");
	}
	
}
