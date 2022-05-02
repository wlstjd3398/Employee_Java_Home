package etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.MemberInfo;
import vo.NoticeInfo;

public class Database {
	public static List<MemberInfo> memberInfoTable = new ArrayList<>();
	public static List<NoticeInfo> noticeInfoTable = new ArrayList<>();
	
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/shopdb?user=root&password=1234");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

	
	
	
}
