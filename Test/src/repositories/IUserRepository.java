package repositories;

import java.util.List;

import zaddom.*;

public interface IUserRepository extends IRepository<User>{

	/** 
	 * 
	 * Metoda wyci�ga u�ytkownik�w po roli
	 * */
	public List<User> withRole(Role role);
	public List<User> withRole(String roleName);
	public List<User> withRole(int roleId);
}