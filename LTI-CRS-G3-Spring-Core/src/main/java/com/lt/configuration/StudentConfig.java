/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.StudentService;
import com.lt.service.StudentServiceInterface;

/**
 * @author 91988
 *
 */
@Configuration
public class StudentConfig {

	@Bean(name = "studentBean")
	public StudentServiceInterface studentService() {
		return new StudentService();
	}

}
