package observer.subject;

import java.util.ArrayList;
//import java.util.List;

import observer.observer.Abonnent;

public abstract class Verlag {

	private ArrayList<Abonnent> abonnentenList = new ArrayList<Abonnent>();
	
	public void addAbo(Abonnent a){
		this.abonnentenList.add(a);
	}
		
	public void removeAbo(Abonnent a){
		this.abonnentenList.remove(a);
	}
	
	public void verteileZeitung(Zeitung z) {
		for(Abonnent a : abonnentenList) {
			a.erhalteZeitung(z);
		}
	}
}
