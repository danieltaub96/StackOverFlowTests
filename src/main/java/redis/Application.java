package redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.annotation.PostConstruct;
import java.util.UUID;

import static org.springframework.boot.SpringApplication.run;

/**
 * @author danieltaub on 04/01/2018.
 */
@SpringBootApplication
@EnableCaching
public class Application{
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    @Autowired private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void run() {
        //Populating embedded database here
        LOG.info("Saving users. Current user count is {}.", userRepository.count());
        Person shubham = new Person(UUID.randomUUID().toString(), "Shubham", 2000);
        Person pankaj = new Person(UUID.randomUUID().toString(), "Pankaj", 29000);
        Person lewis = new Person(UUID.randomUUID().toString(), "Lewis", 550);

        userRepository.save(shubham);
        userRepository.save(pankaj);
        userRepository.save(lewis);
        LOG.info("Done saving users. Data: {}.", userRepository.findAll());
    }
}