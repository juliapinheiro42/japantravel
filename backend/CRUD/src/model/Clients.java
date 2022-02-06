package model;

public class Clients {
private Integer Id;
	
	private String Name;
	
	private String Email;
	
	private String Password;
	
	private Integer Ticket;
	
	public Clients(Integer id, String name, String email, String password, Integer ticket) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Password = password;
		Ticket = ticket;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Integer getTicket() {
		return Ticket;
	}

	public void setTicket(Integer ticket) {
		Ticket = ticket;
	}
	
}

