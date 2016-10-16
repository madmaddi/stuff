package observer.observer;

import observer.subject.Zeitung;

public class PrivaterAbonnent implements Abonnent {

	public String name;
	public PrivaterAbonnent(String n){
		this.name = n;
	}
	
	public void erhalteZeitung(Zeitung z) {
		System.out.println("Ich, " + this.name + ". habe die Zeitung " + z.title + " erhalten" );
	}
}
