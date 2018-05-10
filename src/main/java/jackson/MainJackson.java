package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MainJackson {
    public static void main(String[] args) throws IOException {
        Path path = Paths
                .get("file.json")
                .toAbsolutePath();

        String jsonText = Files.lines(path)
                .reduce("", String::concat);
        ObjectMapper mapper = new ObjectMapper();

        String ss = mapper.writeValueAsString(Registration.builder()
                .name("Lucy")
                .detailsToModify(ModifiableDetails.builder()
                        .currentStatus("active")
                        .enrollmentNumber(001)
                        .build())
                .build());

        System.out.println(ss);
    }
}
