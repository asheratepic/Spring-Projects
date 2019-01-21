import com.spring.learn.service.CustomerService;
import com.spring.learn.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		//notice the hardcoding of implementation again....Spring will help address
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
