package lombok;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
public class SomeEntity {

    @NonNull
    @Contains()
    private Collection<String> fieldOne = new ArrayList<>();

    @NonNull
    @Contains
    private Collection<String> fieldTwo = new ArrayList<>();

    public static void main(String[] args) {

    }
}