package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author danieltaub on 31/01/2018.
 */
public class MainJackson {
    public static void main(String[] args) throws IOException {
        UpdateEvent event = new UpdateEvent();

        ObjectMapper mapper = new ObjectMapper();


        mapper.readValue("{\"eventDefinition\" : {\"name\" :\"daniel\"}}", UpdateEvent.class);
    }
}
