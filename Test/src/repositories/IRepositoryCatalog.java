package repositories;

import domain.*;

public interface IRepositoryCatalog {

	public IUserRepository getUsers();
	public IRepository<Pracownik>getPersons();
	public IRepository<Role>GetRole();
	public void commit();
	IRepository<Pracownik> getPracownik();
	IRepository<Role> getRoles();
}