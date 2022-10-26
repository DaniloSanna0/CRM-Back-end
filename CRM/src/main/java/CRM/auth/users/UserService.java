package CRM.auth.users;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import CRM.auth.UserAlreadyExistException;
import CRM.auth.login.RegisterRequest;
import CRM.auth.roles.ERole;
import CRM.auth.roles.Role;
import CRM.auth.roles.RoleRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	public List<UserResponse> getAllUsersBasicInformations() {
//		userRepository.findAll().stream().map(user -> UserResponse.builder())
		return userRepository.findAll()
				.stream()
				.map( user ->  UserResponse
								.builder()
								.userName(  user.getUsername()  )
								.role( user.getRoles().stream().findFirst().get().getRoleName().name() )
								.build()   
				).collect(Collectors.toList());
	}
	
	public UserResponse getUserBasicInformations(String userName) {
		User user = userRepository.findByUsername(userName).get();
		
		System.out.println(user);
		
		return UserResponse
		.builder()
		.userName(userName)
		.role( user.getRoles().stream().findFirst().get().getRoleName().name()).build();
		
	}
	
	//aggiunto
	
	public List<User> trovaTutti() {
		return (List<User>) userRepository.findAll();
	}

	
	public User trovaPerId(Long id) {
		return userRepository.findById(id).get();
	}

	
	public void cancella(Long id) {
		userRepository.deleteById(id);
		
	}

	
	public void crea(User utenti) {
		userRepository.save(utenti);
		
	}

	
	public void modifica(User utenti) {
		userRepository.save(utenti);
				
	}
	
	public void registra(RegisterRequest register) {
		Boolean checkEmail = userRepository.existsByEmail(register.getEmail());
		Boolean checkUsername = userRepository.existsByUsername(register.getUserName());
		if(checkEmail || checkUsername) {
			throw new UserAlreadyExistException();
		}
		User u = new User();
		u.setUsername(register.getUserName());
		u.setPassword(register.getPassword());
		u.setCognome(register.getCognome());
		u.setEmail(register.getEmail());
		Role r = roleRepository.findByRoleName(ERole.ROLE_USER);
		u.setRoles(new HashSet<Role>() {{add(r);}});
		
		userRepository.save(u);
		
	}

}
