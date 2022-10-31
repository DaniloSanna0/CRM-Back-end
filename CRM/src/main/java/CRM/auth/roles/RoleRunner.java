package CRM.auth.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RoleRunner implements CommandLineRunner {


    @Autowired
    RoleRepository rr;

    @Override
    public void run(String... args) throws Exception {
        Role adminRole = new Role();
        adminRole.setRoleName(ERole.ROLE_ADMIN);
        Role userRole = new Role();
        userRole.setRoleName(ERole.ROLE_USER);

        rr.save(userRole);
        rr.save(adminRole);

    }

}