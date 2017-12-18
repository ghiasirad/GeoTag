package database;

public class DatabaseInfo {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/geotag";
	private static final String USER = "root";
	private static final String PASS = "francaiS87";
	
	public static String getJdbcDriver() {
		return JDBC_DRIVER;
	}

	public static String getDbUrl() {
		return DB_URL;
	}

	public static String getUser() {
		return USER;
	}

	public static String getPass() {
		return PASS;
	}


}
