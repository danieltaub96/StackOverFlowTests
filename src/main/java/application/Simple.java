package application;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import javax.xml.validation.Validator;
import java.text.ParsePosition;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

/**
 * @author danieltaub on 05/01/2018.
 */
public class Simple {

//    public static void main(String [] args) {
//        String datetime = "2018-01-11T21:32:10.876+02:00";
//
//        System.out.println(isDateTime("no"));
//        System.out.println(isDateTime(datetime));
//
//        TemporalAccessor no = parse("no");
//        TemporalAccessor parse1 = parse(datetime);
//
//
//        if (parse(datetime) != null){
//            System.out.println(ZonedDateTime.parse(datetime));
//        }
//
//        System.out.println(no);
//
//
//    }

    public static TemporalAccessor parse(final CharSequence text) {
        ParsePosition pos = new ParsePosition(0);
        TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_ZONED_DATE_TIME.parseUnresolved(text, pos);
        if (temporalAccessor == null || pos.getErrorIndex() >= 0 || pos.getIndex() < text.length()) {
            return null;
        }
        return temporalAccessor;
    }

    private static boolean isDateTime(String str){
        boolean checkDateTimeString;

        try {
            ZonedDateTime.parse(str);
            checkDateTimeString = true;
        } catch (DateTimeParseException e){
            checkDateTimeString = false;
        }
        TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_ZONED_DATE_TIME.parseUnresolved(str, new ParsePosition(0));

       // temporalAccessor.toString();

        return checkDateTimeString;
    }
}
