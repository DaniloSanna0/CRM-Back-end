package CRM.auth.login;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterRequest {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	private String cognome;
	private String email;
}
