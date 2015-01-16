package domain;

public class Desk {

	private String budynek; 
	private String pietro; 
	private String pokoj; 
	private String nrbiurka; 
	private String adresip; 
	
	
	private Pracownik person;

	public String getBudynek() {
		return budynek;
	}

	public void setBudynek(String budynek) {
		this.budynek = budynek;
	}

	public String getPietro() {
		return pietro;
	}

	public void setPietro(String pietro) {
		this.pietro = pietro;
	}

	public String getPokoj() {
		return pokoj;
	}

	public void setPokoj(String pokoj) {
		this.pokoj = pokoj;
	}

	public String getNrbiurka() {
		return nrbiurka;
	}

	public void setNrbiurka(String nrbiurka) {
		this.nrbiurka = nrbiurka;
	}

	public String getAdresip() {
		return adresip;
	}

	public void setAdresip(String adresip) {
		this.adresip = adresip;
	}

	public Pracownik getPerson() {
		return person;
	}

	public void setPerson(Pracownik person) {
		this.person = person;
	}
	
	
}
