package jackson.enums;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
public enum Name {
    Daniel(1),
    Arik(80),
    Tomer(90),
    Rotem(100);

    //private int ordinal;

    Name(int ordinal) {
        //this.ordinal = ordinal;
    }
}
