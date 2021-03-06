package repositories;

import java.util.List;

import domain.*;

public interface IUserRepository extends IRepository<User>{

	/** 
	 * 
	 * Metoda wyciąga użytkowników po roli
	 * */
	public List<User> withRole(Role role);
	public List<User> withRole(String roleName);
	public List<User> withRole(int roleId);
}