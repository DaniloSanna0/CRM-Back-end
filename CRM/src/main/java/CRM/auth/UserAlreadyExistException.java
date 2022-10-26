package CRM.auth;

import org.springframework.security.core.AuthenticationException;

public class UserAlreadyExistException extends AuthenticationException {

	public UserAlreadyExistException() {
		super("utente già esistente");
		// TODO Auto-generated constructor stub
	}

}
