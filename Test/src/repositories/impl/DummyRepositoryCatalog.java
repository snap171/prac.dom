package repositories.impl;

import repositories.IRepositoryCatalog;
import repositories.IUserRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog{

	DummyDb db = new DummyDb();
	
	@Override
	public IUserRepository getUsers() {
		return new DummyUserRepository(db);
	}

}