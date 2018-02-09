import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.TargetDataLine;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author danieltaub on 19/01/2018.
 */
public class NonSpringMain {

    public static void main(String[] args) {
        char[][] ch = new char[3][];
        ch[0] = new char[]{'a', 'b', 'c'};
        ch[1] = new char[]{'d', 'e', 'f'};
        ch[2] = new char[]{'g', 'h', 'i'};

        String[] arr = Arrays.stream(ch)
                .map(String::new)
                .toArray(String[]::new);

        List<String> list = Stream.of(ch)
                .map(String::new)
                .collect(Collectors.toList());
        System.out.println();
    }
}
