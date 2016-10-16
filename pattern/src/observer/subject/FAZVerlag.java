package observer.subject;

public class FAZVerlag extends Verlag{

	Zeitung aktuelleZeitung;

	public Zeitung getAktuelleZeitung() {
		return aktuelleZeitung;
	}

	public void setAktuelleZeitung(Zeitung aktuelleZeitung) {
		this.aktuelleZeitung = aktuelleZeitung;
		this.verteileZeitung(aktuelleZeitung);
	}
	
}
