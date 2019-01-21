import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.learn.service.CustomerService;
import com.spring.learn.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		//CustomerService service = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//notice we using the interface CustomerService instead of a concrete implementation since
		//it lets us swap an implementation behind the scenes without compiling the code again
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
	}

}
