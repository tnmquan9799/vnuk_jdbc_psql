package vn.edu.vnuk.jdbc.psql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			/*
			return DriverManager.getConnection(
				"jdbc:postgresql://localhost/vnuk_personnel", 
				"tnmquan9799", 
				"Mquan123"
			);
			*/
			
			return DriverManager.getConnection(
				"jdbc:postgresql://localhost/teacher_dev", 
				System.getenv("db_user"), 
				System.getenv("db_password")
			);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

