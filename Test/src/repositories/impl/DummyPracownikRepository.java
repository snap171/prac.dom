package repositories.impl;

import java.util.List;

import domain.Pracownik;
import repositories.IRepository;

public class DummyPracownikRepository implements IRepository<Pracownik>{

	private DummyDb db;
	
	public DummyPracownikRepository(DummyDb db) {
		this.db = db;
	}

	@Override
	public void save(Pracownik entity) {

		db.pracownik.add(entity);
		
	}

	@Override
	public void update(Pracownik entity) {
		
	}

	@Override
	public void delete(Pracownik entity) {

		db.pracownik.remove(entity);
		
	}

	@Override
	public Pracownik get(int id) {

		for(Pracownik p: db.pracownik)
			if(p.getId()==id)
				return p;
		return null;
	}

	@Override
	public List<Pracownik> getAll() {
		return db.pracownik;
	}

}