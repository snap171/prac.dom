package repositories.impl;

import domain.Pracownik;
import domain.Role;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IUserRepository;

public abstract class DummyRepositoryCatalog implements IRepositoryCatalog{

	private DummyDb db = new DummyDb();
	
	@Override
	public IUserRepository getUsers() {
		return new DummyUserRepository(db);
	}

	@Override
	public IRepository<Pracownik> getPersons() {
		return new DummyPracownikRepository(db);
	}

	public IRepository<Role> getRoles() {
		// TODO Auto-generated method stub
		return new DummyRoleRepository(db);
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}

}