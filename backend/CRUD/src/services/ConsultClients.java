package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import connector.ConexaoComBanco;
import model.Clients;

public class ConsultClients {
	private static final Integer Id = null;
	private static final String name = null;
	private static final String password = null;
	private static final String email = null;
	private static final Integer ticket = null;
	

	public void save() {
		Scanner sc = new Scanner(System.in);
		
		Clients cliente = new Clients(Id,name, email, password, ticket);
		
		System.out.println("Digite o nome do Cliente: ");
		cliente.setName(sc.nextLine());
		
		System.out.println("Digite o Email do Cliente: ");
		cliente.setEmail(sc.nextLine());
		
		System.out.println("Digite a Senha do Cliente: ");
		cliente.setPassword(sc.nextLine());
		
		System.out.println("Digite o id do Destino do Cliente: ");
		cliente.setTicket(sc.nextInt());
	
		String sql = "INSERT INTO CLIENTES (name, email,password, TicketId) "
				+ "VALUES (?,?,?,?) ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getName());
			pstm.setString(2, cliente.getEmail());
			pstm.setString(3, cliente.getPassword());
			pstm.setInt(4, cliente.getTicket());
			
			pstm.execute();
			System.out.println("Cliente Cadastrado!");
			
			conn.close();
			pstm.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void update() {
		Scanner sc = new Scanner(System.in);
		
		Clients cliente = new Clients(Id, name, email, password, ticket);
		
		System.out.println("Digite o nome do Cliente: ");
		cliente.setName(sc.nextLine());
		sc.nextLine();
		System.out.println("Digite o Email do Cliente: ");
		cliente.setEmail(sc.nextLine());
		
		System.out.println("Digite a Senha do Cliente: ");
		cliente.setPassword(sc.nextLine());
		
		System.out.println("Digite o Destino do Cliente: ");
		cliente.setTicket(sc.nextInt());
		
	
		String sql = "UPDATE CLIENTES set "
		+ "name= ?, email = ?, "
		+ "password = ?,TicketId = ?  where Id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, cliente.getName());
			pstm.setString(2, cliente.getPassword());
			pstm.setString(3, cliente.getEmail());
			pstm.setInt(4, cliente.getTicket());
			
			pstm.execute();
			
			System.out.println("Cliente Atualizado Com Suscesso!");
			conn.close();
			pstm.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		
		Clients cliente = new Clients(Id, name, email, password, ticket);
		
		System.out.println("Digite o Id do Cliente: ");
		cliente.setId(sc.nextInt());
	
		String sql = "DELETE FROM CLIENTES "
		+ "where Id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, cliente.getId());
			
			pstm.execute();
			
			System.out.println("Cliente Deletado!");
			conn.close();
			pstm.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
		
		public void read() {
		
			Connection conn = null;
			Statement st = null;
			ResultSet rs = null;
			
			try {
				conn = ConexaoComBanco.createConnection();
				st = conn.createStatement();			
				
				rs = st.executeQuery("select * from clientes");
				
				while (rs.next()) {
					System.out.println(rs.getInt("Id") + " , " + rs.getString("name") + " , " + rs.getString("email") + " , " + rs.getString("password"));
				}
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
	
		}
}

