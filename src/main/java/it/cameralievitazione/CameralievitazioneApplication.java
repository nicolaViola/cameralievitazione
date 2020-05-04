package it.cameralievitazione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CameralievitazioneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CameralievitazioneApplication.class, args);
	}
	
	@GetMapping
	public String hi() {
		return "HI2";
	}

}
