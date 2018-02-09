package mapstruct;

/**
 * @author danieltaub on 22/01/2018.
 */
public class StartMain {
    public static void main(String[] args) {
        Cat convert = DogMapper.mapper.convert(new Dog());

        System.out.println(convert.toString());
    }
}
