package jackson;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class ModifiableDetails {
    String currentStatus;
    int enrollmentNumber;
}