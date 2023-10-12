package user;

public class UserRequestDto {
	
	private int id; // Entity PK 
	private String username;
	private String password;
	private String name;

	public UserRequestDto() {}
	public UserRequestDto(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public UserRequestDto(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public int getId() {
		return id;
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
