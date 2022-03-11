package ro.ase.acs.sqlmethods;

import java.sql.Connection;

public interface TableOperation<T> {

	T operate(Connection connection);

}
