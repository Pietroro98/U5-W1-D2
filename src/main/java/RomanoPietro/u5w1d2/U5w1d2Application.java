package RomanoPietro.u5w1d2;

import RomanoPietro.u5w1d2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5w1d2Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5w1d2Application.class);

		Menu menu = context.getBean(Menu.class);
		System.out.println(menu);

		context.close();
	}

}
