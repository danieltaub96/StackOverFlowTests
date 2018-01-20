package application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author danieltaub on 30/12/2017.
// */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = SimpleTestConfig.class)
@ActiveProfiles("test")
public class SimpleTest {
    @Value("${ssss:hello world}")
    private String text;
    @Test
    public void test() {
        assertEquals(text, "hello world");
    }
}