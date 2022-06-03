/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.AdminService;
import com.lt.service.AdminServiceInterface;
import com.lt.service.UserService;
import com.lt.service.UserServiceInterface;

/**
 * @author 91988
 *
 */
@Configuration
public class UserConfig {
	@Bean(name = "userBean")
	public UserServiceInterface userService() {
		return new UserService();
	}

}
