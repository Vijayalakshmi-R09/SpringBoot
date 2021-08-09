package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import beans.Manager;
import beans.ManagerImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
		@Bean(name="ConfigurationExample")
		public Manager hello()
		{
			return new ManagerImpl();
		}		
}
