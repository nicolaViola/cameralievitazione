package it.cameralievitazione;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CameralievitazioneApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CameralievitazioneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CameralievitazioneApplication.class, args);
	}
	
	@GetMapping
	public String hi() {
		LOGGER.debug("dentro");
		return "HI2";
	}

}
