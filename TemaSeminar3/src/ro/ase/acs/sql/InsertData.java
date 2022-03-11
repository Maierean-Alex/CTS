package ro.ase.acs.sql;

import ro.ase.acs.sqlmethods.TableOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData implements TableOperation<Connection> {

	public Connection operate(Connection connection) {
		String sqlInsert = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
		Statement statement;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sqlInsert);
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sqlInsertWithParams = "INSERT INTO employees VALUES (?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sqlInsertWithParams);
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Ionescu Vasile");
			preparedStatement.setString(3, "Brasov");
			preparedStatement.setDouble(4, 4500);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

}
