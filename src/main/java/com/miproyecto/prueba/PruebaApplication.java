package com.miproyecto.prueba;

// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import ch.qos.logback.classic.Logger;

@SpringBootApplication
@RestController
// public class PruebaApplication implements CommandLineRunner {
	public class PruebaApplication {

	// private static org.slf4j.Logger LOG = LoggerFactory.getLogger(PruebaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	//System.out.println("Hola coca cola");
	// 	LOG.info("HOOOOOOOOOOOOOOOOOOOOOOOlla");
	// }
	// public static void hola("/hello") {

	// }

	@GetMapping("/saludo")
    public String hello (@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
