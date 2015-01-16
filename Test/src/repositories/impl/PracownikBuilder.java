package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Pracownik;

public class PracownikBuilder implements IEntityBuilder<Pracownik>{

	@Override
	public Pracownik build(ResultSet rs) throws SQLException {
		Pracownik Pracownik = new Pracownik();
		Pracownik.setImie(rs.getString("imie"));
		Pracownik.setNazwisko(rs.getString("nazwisko"));
		Pracownik.setId(rs.getInt("id"));
		return Pracownik;
	}

}