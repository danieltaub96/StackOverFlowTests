//package application;
//
//import com.google.common.base.Charsets;
//import com.google.common.io.Resources;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.IOException;
//import java.net.URL;
//
///**
// * @author danieltaub on 30/12/2017.
// *         //
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ActiveProfiles("test")
//public class SimpleTestSpring {
//    @Test
//    @Scheduled(fixedDelay = 10000)
//    public void test() throws IOException {
//        URL url = Resources.getResource("migrations/V0__create_vendor_table.sql");
//        String text = Resources.toString(url, Charsets.UTF_8);
//
//        System.out.println(text);
//    }
//
//}