package hibernate.example.lazyerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication(
	scanBasePackages = { "hibernate.example" }
)
public class LazyErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyErrorApplication.class, args);
	}
}
