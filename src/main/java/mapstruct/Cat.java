package mapstruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author danieltaub on 22/01/2018.
 */
@Getter
@Setter
public class Cat extends Father{
    private String say;
    private String otherField;
}
