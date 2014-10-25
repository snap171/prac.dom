package zaddom;

import java.util.*;

public class Role extends Entity  {

	private String name;
	private List<Uprawnienia> uprawnienia;
	private List<User> users;
	
	public Role()
	{
		uprawnienia = new ArrayList<Uprawnienia>();
		users = new ArrayList<User>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Uprawnienia> getUprawnienia() {
		return uprawnienia;
	}
	public void setPrivilege(List<Uprawnienia> privilege) {
		this.uprawnienia = privilege;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
}