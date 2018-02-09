package application.starters;

import application.configuration.HermesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.stream.Stream;

/**
 * @author danieltaub on 04/01/2018.
 */
@Component
public class Starter {
    @Autowired InetAddress inetAddress;

    @PostConstruct
    public void init() throws IOException {

        final String[] commands = {"hostname"};


        Process hostname = Runtime.getRuntime().exec("hostname");

        BufferedReader stdInput = new BufferedReader(new
                InputStreamReader(hostname.getInputStream()));

        String s;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }


        System.out.println();
    }



    @Bean
    public InetAddress inetAddress() throws UnknownHostException {
        return InetAddress.getLocalHost();
    }
}
