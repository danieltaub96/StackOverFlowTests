package application.springEnum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.query.JpaQueryExecution;
import org.springframework.stereotype.Repository;

/**
 * @author danieltaub on 07/05/2018.
 */
@Repository
public interface Connector extends JpaRepository<DTO, String>, JpaSpecificationExecutor<DTO>, Jpa {
}
