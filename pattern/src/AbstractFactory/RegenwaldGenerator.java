package AbstractFactory;

public class RegenwaldGenerator implements AbstractGenerator {

	public Pflanze createPflanze() {
		return new Baum();
	}
	
	public Tier createTier() {
		return new Elefant();
	}
	
	public Untergrund createUntergrund() {
		return new Gras();
	}
}
