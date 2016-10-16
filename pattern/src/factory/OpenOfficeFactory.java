package factory;

public class OpenOfficeFactory extends SoftwareShop {
	
	protected OfficeProgramm createOfficeProgramm(String s) {
		OfficeProgramm programm = null;
		if (s.equals("Textverarbeitung")) programm = new Write();
		
		return programm;
	}
}
