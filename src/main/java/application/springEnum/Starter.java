package application.springEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

/**
 * @author danieltaub on 07/05/2018.
 */
@Component
public class Starter {
    @Autowired
    private Connector connector;

    @PostConstruct
    public void init() {
        DTO dto = DTO.builder()
                .id(UUID.randomUUID().toString())
                .helloEnum(Hello.HELLO)
                .build();

        connector.save(dto);

        connector.fi

        List<DTO> result = connector.findAll((root, query, cb) -> {
                    query.select(root.get("helloEnum"));

                    return cb.equal(root.get("helloEnum").as(String.class), "HELLO");

                }
        );

        System.out.println();
    }
}
