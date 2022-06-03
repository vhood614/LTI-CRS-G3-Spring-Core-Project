/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 91988
 *
 */

@Configuration
@Import({AdminConfig.class,StudentConfig.class,ProfessorConfig.class,UserConfig.class})
public class AppConfig {

}
