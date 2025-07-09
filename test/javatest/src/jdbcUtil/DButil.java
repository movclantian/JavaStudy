package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static String driveName = "com.mysql.cj.jdbc.Driver"; // 确保驱动类名正确
	public static String url = "jdbc:mysql://localhost:3306/test07_multidql?useUnicode=true&characterEncoding=utf-8";
	public static String userName = "root";
	public static String password = "051105";
	public Connection getConnection() throws Exception {
		Class.forName(driveName);
		Connection connection=DriverManager.getConnection(url, userName, password);
		return connection;
	}
	public void closeConnection(Connection con) throws SQLException {
		if (con!=null) {
			con.close();
		}
	}
}
