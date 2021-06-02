package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private String usuario="root";
	private String senha="";
	private String servidor="localhost";
	private String porta="3306";
	private String banco ="admusuario";
	private Connection conexao; 
	private String url ="jdbc:mysql://"+servidor+":"+porta+"/"+banco+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	
	public Connection getConexao() throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		conexao = DriverManager.getConnection(url,"root","");
		return conexao;
		
	}

}
