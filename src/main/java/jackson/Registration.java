package jackson;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Registration {
    String name;

    @JsonUnwrapped
    ModifiableDetails detailsToModify;
}