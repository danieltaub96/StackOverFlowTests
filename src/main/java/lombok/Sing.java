package lombok;

import java.util.List;

@Builder(toBuilder = true)
public class Sing {
    @Getter
    @Builder.ObtainVia(method = "getHello")
    private String hello;

    @Singular("list")
    private List<String> list;

    {


    }
}
