package lk.ijse.demo;

import lk.ijse.demo.entity.User;
import lk.ijse.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {
	@Autowired
	private UserRepo userRepo;

	@PostConstruct
	public void initUser(){
		List<User> users = Stream.of(
				new User((long) 100, "Nipun", "nipun123", "nipun1999@gmail.com"),
				new User((long) 101, "Chathuranga", "chathuranga123", "chathuranga1999@gmail.com"),
				new User((long) 102, "Jayalath", "jayalath123", "jayalath1999@gmail.com"),
				new User((long) 103, "Lakshika", "lakshika123", "lakshika1999@gmail.com")
		).collect(Collectors.toList());
		userRepo.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
