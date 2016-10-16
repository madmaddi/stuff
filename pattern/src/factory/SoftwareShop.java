package factory;

public abstract class SoftwareShop {

	public OfficeProgramm holeApp(String s) {
		OfficeProgramm programm = this.createOfficeProgramm(s);
		programm.einpacken();
		programm.ettiketieren();
		return programm;
	}
	
	protected abstract OfficeProgramm createOfficeProgramm(String s);
}
