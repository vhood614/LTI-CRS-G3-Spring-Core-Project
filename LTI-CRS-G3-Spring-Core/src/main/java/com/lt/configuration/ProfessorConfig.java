/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.AdminService;
import com.lt.service.AdminServiceInterface;
import com.lt.service.ProfessorService;
import com.lt.service.ProfessorServiceInterface;

/**
 * @author 91988
 *
 */
@Configuration
public class ProfessorConfig {
	@Bean(name = "professorBean")
	public ProfessorServiceInterface professorService() {
		return new ProfessorService();
	}

}
