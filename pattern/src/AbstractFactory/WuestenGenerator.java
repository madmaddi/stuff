package AbstractFactory;

public class WuestenGenerator implements AbstractGenerator {
	public Pflanze createPflanze() {
		return new Kaktus();
	}
	
	public Tier createTier() {
		return new Kamel();
	}
	
	public Untergrund createUntergrund() {
		return new Sand();
	}
}
