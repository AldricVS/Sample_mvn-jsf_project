package business.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoC {
	private static final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	public static Object getBean(String beanName) {
		return context.getBean(beanName);
	}

	public static <T> T getBean(String beanName, Class<T> castToType) {
		return castToType.cast(context.getBean(beanName));
	}
}
