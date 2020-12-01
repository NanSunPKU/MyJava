import java.sql.*;

class Database {
	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");	

		Connection con = DriverManager.getConnection("jdbc:sqlite:C://MyJava//sqlite-tools//univ.db");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from dept");
		
		int dno;		
		String name;
		while (rs.next()) {
			dno = rs.getInt("deptno");
			name = rs.getString("dname");		
			System.out.println("Dept No: " + dno + ", Dept Name: " + name);

		}
	}
}