package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection conn=null;
	
		String url="jdbc:mysql://localhost:3306/carsharing"; //MySQL���� carsharing�̸����� ��Ű��/schema ����ð� �ű⿡ ���̺� create�Ͻø� �˴ϴ�.
		String user="root";
		String password="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,user,password);
		return conn;
		
	}
	//���� �ߵǴ��� �׽�Ʈ�� main�޼ҵ�
	 public static void main(String[] args) throws ClassNotFoundException,
	  SQLException { if(DBConnection.getConnection()!=null)
	 System.out.println("���� ����!"); else System.out.println("���� ����!"); }
	
}