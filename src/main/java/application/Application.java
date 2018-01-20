package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

import static org.springframework.boot.SpringApplication.run;

/**
 * @author danieltaub on 04/01/2018.
 */
@SpringBootApplication
public class Application {
    @Autowired
    private Environment environment;
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .properties("spring.config.name:conf")
                .build()
                .run(args);
    }

    @PostConstruct
    private void init(){
        System.out.println(environment.getProperty("spring.config.name"));

    }
}
