package jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author danieltaub on 01/03/2018.
 */
public class MyClass {
    @JsonProperty(required = true)
    private String daniel;
}
