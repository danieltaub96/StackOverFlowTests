package hibernate;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

/**
 * @author danieltaub on 04/01/2018.
 */
public class HibernateMain {

    public static void main(String[] args) {
        DBAccessor accessor = new DBAccessor();


        accessor.openCurrentSessionwithTransaction();

        A a = A.builder()
                .id("a")
                .b(asList(
                        B.builder()
                        .id("1")
                        .c(C.builder().id("2").build())
                        .build()))
                .build();

        accessor.persist(a);


        accessor.closeCurrentSessionwithTransaction();
    }
}
