package user;

public class UserResponseDto {
	private int id;
	private String username;
	private String password;
	private String name;

	public UserResponseDto(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.name = user.getName();
	}
	
	public UserResponseDto(UserRequestDto user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.name = user.getName();
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
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("%d) %s/%s : %s", this.id, this.username, this.password, this.name);
	}
}
