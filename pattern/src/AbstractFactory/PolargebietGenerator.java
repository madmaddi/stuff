package AbstractFactory;

public class PolargebietGenerator implements AbstractGenerator{

	public Pflanze createPflanze() {
		return new Flechte();
	}
	
	public Tier createTier() {
		return new Eisbaer();
	}
	
	public Untergrund createUntergrund() {
		return new Schnee();
	}
}
