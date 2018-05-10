package application;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author danieltaub on 27/02/2018.
 */
@RunWith(CustomRunner.class)
public class SimpleTest {

    @Test
    public void test(){
        System.out.println("hello");
        assertEquals(1, 1);
    }


    @Test
    public void test2(){
        System.out.println("hello");
        assertEquals(1, 1);
    }
}
