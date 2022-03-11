package ro.ase.acs.sqlmethods;

import java.sql.Connection;

public interface TableReader {
	
	Connection readValues(Connection connection);

}
