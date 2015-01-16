package domain;

import java.util.*;

public class User extends Entity{

	private String login;
	private String pass;
	private Pracownik pracownik;
	private List<Role> role;
	
	public User()
	{
		role = new ArrayList<Role>();
	}
	
	public List<Role> getRoles() {
		return role;
	}
	public void setRoles(List<Role> roles) {
		this.role = role;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPassword(String pass) {
		this.pass = pass;
	}
	public Pracownik getPracownik() {
		return pracownik;
	}
	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}
	
	
}
