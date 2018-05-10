//package lombok;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.IOException;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {SimpleSneakyThrowsExampleTest.class, SneakyThrowsExample.class, SimpleSneakyThrowsExample.class, TransactionalSneakyThrowsExample.class})
//public class SimpleSneakyThrowsExampleTest {
//
//    @Autowired
//    @Qualifier(value = "transactionalSneakyThrowsExample")
//    SneakyThrowsExample transactionalSneakyThrowsExample;
//
//    @Autowired
//    @Qualifier(value = "simpleSneakyThrowsExample")
//    SneakyThrowsExample simpleSneakyThrowsExample;
//
//    @Test(expected = IOException.class)
//    public void testSneakyThrowsSimple() throws Exception {
//        this.simpleSneakyThrowsExample.testSneakyThrows();
//    }
//
//    @Test(expected = IOException.class)
//    public void testSneakyThrowsTransactional() throws Exception {
//        this.transactionalSneakyThrowsExample.testSneakyThrows();
//    }
//}