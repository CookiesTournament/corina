package org.cookiesturnier.corina;

import javassist.NotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorinaApplication {

    public static void main(String[] args) throws NotFoundException {
        SpringApplication.run(CorinaApplication.class, args);
    }

}
