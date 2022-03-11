package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ro.ase.acs.sqlmethods.TableOperation;

public class CreateTable implements TableOperation<Connection> {
	
	public Connection operate(Connection connection) {
		String sqlDrop = "DROP TABLE IF EXISTS employees";
		String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY," + "name TEXT, address TEXT, salary REAL)";
		try {

			Statement statement = connection.createStatement();
			statement.executeUpdate(sqlDrop);
			statement.executeUpdate(sqlCreate);
			statement.close();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

}
