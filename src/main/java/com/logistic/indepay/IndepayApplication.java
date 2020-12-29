package com.logistic.indepay;

import com.logistic.indepay.model.Role;
import com.logistic.indepay.model.User;
import com.logistic.indepay.repository.RoleRepository;
import com.logistic.indepay.repository.UserRepository;
import com.logistic.indepay.service.CaptureDetails;
import com.logistic.indepay.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class IndepayApplication implements CommandLineRunner {

	@Autowired
	CaptureDetails captureDetails;

	@Autowired
	IService<User> userService;
	@Autowired
	IService<Role> roleService;

	public static void main(String[] args) {
		SpringApplication.run(IndepayApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//captureDetails.fetchAgentInfo();;
		/*Role role = new Role();
		role.setName("admin");
		roleService.saveOrUpdate(role);

		User user = new User();
		user.setEmail("admin@admin.com");
		user.setName("admin");
		user.setPassword(new BCryptPasswordEncoder().encode("test"));
		user.setRole(roleService.findById(1l).get());
		userService.saveOrUpdate(user);*/

	}
}
