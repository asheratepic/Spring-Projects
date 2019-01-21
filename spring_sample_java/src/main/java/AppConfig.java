import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.spring.learn.service.CustomerService;
import com.spring.learn.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.spring"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
////		return new CustomerServiceImpl();
//		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		
//		
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		//commenting out the following line and let the Autowiring take 
//		//care of injecting the customerRepository bean
//		//because we add the @Autowired annotation on the member variable
//		//inside CustomerServiceImpl class
//		
//		//service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
