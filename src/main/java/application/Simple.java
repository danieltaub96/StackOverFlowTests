//package application;
//
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//import lombok.Setter;
//
//import javax.xml.validation.Validator;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.text.ParsePosition;
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
//import java.time.temporal.TemporalAccessor;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author danieltaub on 05/01/2018.
// */
//public class Simple {
//
//    @Setter(onParam = @__(@))
//    private String year;
//
//    public static void main(String[] args) throws IOException {
//
//        final String directoryName = "/Users/daniel/Documents/StackOverflowTests";
//
//       // listFilesAndFilesSubDirectories(directoryName)
//       //         .forEach(System.out::println);
//    }
//
//
////    public static List<String> listFilesAndFilesSubDirectories(String directoryName) throws Exception {
////        return Files.walk(Paths.get(directoryName))
////                .map(Path::toFile)
////                .map(x -> new FileInputStream(x))
////                .map(x -> x)
////
////                .collect(Collectors.toList());
//    }
//}
