package repositories;

import java.util.List;

import zaddom.*;

public interface IUserRepository extends IRepository<User>{

	/** 
	 * 
	 * Metoda wyci¹ga u¿ytkowników po roli
	 * */
	public List<User> withRole(Role role);
	public List<User> withRole(String roleName);
	public List<User> withRole(int roleId);
}