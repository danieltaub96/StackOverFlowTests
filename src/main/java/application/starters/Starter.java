package application.starters;

import org.springframework.stereotype.Component;
import server.ExtLogger;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * @author danieltaub on 04/01/2018.
 */
@Component
public class Starter {

    @PostConstruct
    public void init() throws IOException {

        ExtLogger logger = ExtLogger.create();
        logger.info("Debug message");

        System.out.println();

    }

}
