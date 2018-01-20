package application.apache;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author danieltaub on 19/01/2018.
 */
public class Cli {

    private static Option getOption(){
        return Option.builder("b").argName("command_string")
                .hasArgs()
                .optionalArg(false)
                .desc("command used to build a program")
                .longOpt("build")
                .build();
    }


    public static void parse(String[] args) throws ParseException {
        CommandLineParser parser = new DefaultParser();

        Options options = new Options();


        options.addOption(getOption());
        CommandLine cmd = parser.parse(options, args);;


        Stream.of(cmd.getOptions()).forEach(System.out::println);
    }

    public static void main(String[] args) throws ParseException {
      parse(args);
    }
}
