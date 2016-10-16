import AbstractFactory.*;

public class AbstractFactory {
	public static void main(String[] args) {
		PolargebietGenerator pg = new PolargebietGenerator();
		WuestenGenerator wg = new WuestenGenerator();
		RegenwaldGenerator rg = new RegenwaldGenerator();
		
		Tier tier1 = pg.createTier(); // eisbaer
		Tier tier2 = wg.createTier(); // kamel
		Tier tier3 = rg.createTier(); // elefant
		
		System.out.println(tier1);
		System.out.println(tier2);
		System.out.println(tier3);
		
	}
}
