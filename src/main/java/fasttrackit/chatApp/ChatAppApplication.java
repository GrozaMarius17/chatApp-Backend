package fasttrackit.chatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ChatAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(ChatAppApplication.class, args);
		System.out.println("Marius");	}

}