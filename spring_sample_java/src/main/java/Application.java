import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learn.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		
		//printing to show the default bean scope of singleton
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
	}

}
