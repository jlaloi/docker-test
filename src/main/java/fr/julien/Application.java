package fr.julien;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by julien on 27/03/16.
 */
@SpringBootApplication
@RestController
public class Application {

    private Logger logger = org.slf4j.LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Tocard!";
    }

    @RequestMapping(value = "log", method = RequestMethod.POST)
    public String send(@RequestBody String txt) {
        logger.info(txt);
        return txt;
    }

}