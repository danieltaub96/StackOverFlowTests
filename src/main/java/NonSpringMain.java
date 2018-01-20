import java.util.Properties;

/**
 * @author danieltaub on 19/01/2018.
 */
public class NonSpringMain {
    public String text = "hello world";
    public static void main(String[] args) {

        Properties p = new Properties();
        p.setProperty("name", "XYX");
        p.setProperty("email", "xyx@mail.com");
        p.setProperty("address", "addr-street-city");

        p.entrySet().stream()
                .map(entry -> String.format("%s : %s", entry.getKey(), entry.getValue()))
                .forEach(System.out::println);
    }


}
