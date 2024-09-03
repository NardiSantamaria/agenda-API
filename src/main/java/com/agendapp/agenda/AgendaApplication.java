package com.agendapp.agenda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import com.agendapp.agenda.controller.ItemFactory;
import com.agendapp.agenda.entity.Registry;
@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
		System.out.println("BackEnd for agenda app is running");
		try {
			Object obj= ItemFactory.createItem("com.agendapp.agenda.entity.Notification");
			System.out.println(obj);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("*").allowedOrigins("*");
			}
	
		};
	}
}
