import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class ParameterRuleTest {

    private int value;


    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1},
                {2},
        });
    }

    public ParameterRuleTest(int value) {
        this.value = value;
        System.out.println("Testing:" + value);
    }



    public ExternalResource externalResource = new ExternalResource() {
        protected void before() throws Throwable {
            System.out.println("before");
        }

        protected void after() {
            System.out.println("after");
        }
    };

    @Before
    public void init(){
        System.out.println("before" + value);
    }


    @Test
    public void myTest1() {
        System.out.println("test");
    }
}