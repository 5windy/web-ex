package user;

public class User {
	private int id; // Entity PK 
	private String username;
	private String password;
	private String name;

	public User() {}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	public User(UserRequestDto user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.name = user.getName();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
