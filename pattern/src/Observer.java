
import observer.observer.*;
import observer.subject.FAZVerlag;
import observer.subject.Zeitung;

public class Observer {

	public static void main(String[] args) {
		Organisation firmaA = new Organisation("Firma A");
		Organisation firmaB = new Organisation("Firma B");
		PrivaterAbonnent max = new PrivaterAbonnent("Max");
		PrivaterAbonnent mux = new PrivaterAbonnent("Mux");
		
		Zeitung januar = new Zeitung("Januar Ausgabe");
		Zeitung februar = new Zeitung("Februar Ausgabe");
		
		FAZVerlag faz = new FAZVerlag();
		faz.addAbo(firmaA);
		faz.addAbo(firmaB);
		faz.addAbo(max);
		faz.addAbo(mux);
		faz.setAktuelleZeitung(januar);
		
		
		faz.removeAbo(mux);
		faz.setAktuelleZeitung(februar);
	}
}
