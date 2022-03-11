package ro.ase.acs.sql;

import ro.ase.acs.sqlmethods.TableReader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData implements TableReader {

	public Connection readValues(Connection connection) {
		String sqlSelect = "SELECT * FROM employees";
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sqlSelect);
			while (rs.next()) {
				int id = rs.getInt("id");
				System.out.println("id: " + id);
				String name = rs.getString(2);
				System.out.println("name: " + name);
				String address = rs.getString("address");
				System.out.println("address: " + address);
				double salary = rs.getDouble("salary");
				System.out.println("salary: " + salary);
			}
			rs.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

}
