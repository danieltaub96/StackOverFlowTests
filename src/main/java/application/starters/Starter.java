package application.starters;

import application.configuration.HermesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author danieltaub on 04/01/2018.
 */
@Component
public class Starter {
    @PostConstruct
    public void init(){
        //System.out.println(bla.bla);
       // System.out.println(bla.getBla());
    }
}
