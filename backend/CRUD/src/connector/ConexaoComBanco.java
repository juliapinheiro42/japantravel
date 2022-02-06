package connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoComBanco {
	
	private static String DATABASE_URL = "jdbc:mysql://localhost:3306/viagem_3";
	
	private static String USER = "julia42";
	
	private static String PASSWORD = "260298Na*";
	
	public static Connection createConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
		
		return conn;
	}
	
	public static void main(String[] args) throws Exception{
		Connection conn = createConnection();
		
		if(conn != null) {
			System.out.println("Conex�o obtida com suscesso!");
		}else {
			System.out.println("Erro ao conectar!");
		}
	}
}