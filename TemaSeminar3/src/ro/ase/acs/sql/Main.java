package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		
		CreateTable createTable = new CreateTable();
		InsertData insertData = new InsertData();
		ReadData readData = new ReadData();
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
			connection.setAutoCommit(false);
			
			createTable.operate(connection);
			insertData.operate(connection);
			readData.readValues(connection);
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
