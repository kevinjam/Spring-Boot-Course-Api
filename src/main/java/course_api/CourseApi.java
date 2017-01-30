package course_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CourseApi {

	@RequestMapping("/hello")
	public static void main(String[] args) {
		// static methods
		SpringApplication.run(CourseApi.class, args);

	}

}
