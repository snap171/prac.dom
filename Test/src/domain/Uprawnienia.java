package domain;

import java.util.*;

public class Uprawnienia extends Entity {

	private String name;
	
	private List<Role> role;
	
	public Uprawnienia()
	{
		role = new ArrayList<Role>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}
}
