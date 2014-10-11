package zaddom;

import java.util.ArrayList;
import java.util.List;

public class Pracownik {

	public Pracownik()
	{
		this.Desks=new ArrayList<Desk>();
	}
	
	private String imie; 
	private String nazwisko; 
	private String id; 
	
	private User user;
	private List<Desk> Desks;
	public String getImiee() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Desk> getDesks() {
		return Desks;
	}
	public void setDesks(List<Desk> desks) {
		this.Desks = desks;
	}
	
	
	
}
