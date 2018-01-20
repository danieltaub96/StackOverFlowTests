package application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.MessageFormat;

@Component
public class Initializer {
    @Setter
    public static String VAL;

    public static String DropDownDisplay(){
        return MessageFormat.format("{0} - {1}, {2} - {3}", "name", "city", "state", "id");
    }

    @PostConstruct
    public void init(){
        System.out.println(DropDownDisplay());
    }


//    public static void main(String[] args) {
//        System.out.println(DropDownDisplay());
//
//    }


}