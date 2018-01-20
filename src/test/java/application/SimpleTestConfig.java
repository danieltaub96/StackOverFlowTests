package application;

import application.starters.Starter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author danieltaub on 04/01/2018.
 */
//@SpringBootApplication(exclude = Starter.class)
//@ComponentScan(basePackageClasses = {
//        SimpleTestConfig.class,
//        Application.class
//        },
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ASSIGNABLE_TYPE,
//        classes = Starter.class))
@SpringBootApplication()
@ComponentScan(excludeFilters=@ComponentScan.Filter(type = FilterType.REGEX, pattern="application.starters.Starter*"))
public class SimpleTestConfig {
}
