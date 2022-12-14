package CRM.auth.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
	private String userName;
	@Getter
	private String role;
	
	public String getRole() {
		return role;
	}
}
