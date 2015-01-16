package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Pracownik;
import repositories.IRepository;
import unitofwork.IUnitOfWork;

public class PracownikRepository 
	extends Repository<Pracownik>{

	protected PracownikRepository(Connection connection,
			IEntityBuilder<Pracownik> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Pracownik entity) throws SQLException {
		update.setString(1, entity.getid());
		update.setString(2, entity.getNazwisko());
		update.setInt(3, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Pracownik entity) throws SQLException {
		insert.setString(1, entity.getid());
		insert.setString(2, entity.getNazwisko());
			}

	@Override
	protected String getTableName() {
		return "Pracownik";
	}

	@Override
	protected String getUpdateQuery() {
		return "update Pracownik set (id,Nazwisko)=(?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into Pracownik(name,Nazwisko) values(?,?)";
	}
	
}