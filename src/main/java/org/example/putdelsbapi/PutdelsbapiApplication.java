package org.example.putdelsbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PutdelsbapiApplication {

    public static void main(String[] args) {

        SpringApplication.run(PutdelsbapiApplication.class, args);
        System.out.println("server is running on the port 8080");
    }

}
