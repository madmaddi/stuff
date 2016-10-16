import strategy.context.*;
import strategy.strategy.*;
public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dackel dackel = new Dackel();
		Rottweiler rottweiler = new Rottweiler();
		
		LeiseBellen leise = new LeiseBellen();
		LautBellen laut = new LautBellen();
		Klaeffen klaeffen = new Klaeffen();
		
		Humpeln humpeln = new Humpeln();
		LangsamLaufen langsam = new LangsamLaufen();
		SchnellLaufen schnell = new SchnellLaufen();
		
		dackel.bellen();
		dackel.setBellen(klaeffen);
		dackel.bellen();
		dackel.laufen();
		dackel.setLaufen(humpeln);
		dackel.laufen();
		
		rottweiler.bellen();
		rottweiler.setBellen(leise);
		rottweiler.bellen();
		rottweiler.setBellen(laut);
		rottweiler.bellen();
		
		rottweiler.setLaufen(langsam);
		rottweiler.laufen();
		rottweiler.setLaufen(schnell);
		rottweiler.laufen();
	}

}
