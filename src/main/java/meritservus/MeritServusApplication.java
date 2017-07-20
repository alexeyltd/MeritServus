package meritservus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeritServusApplication {

	private static final Logger logger = LoggerFactory.getLogger(MeritServusApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MeritServusApplication.class, args);
		logger.debug("--Application Started--");
	}

}
