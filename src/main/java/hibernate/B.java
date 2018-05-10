package hibernate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import static org.hibernate.annotations.CascadeType.DELETE;
import static org.hibernate.annotations.CascadeType.DETACH;
import static org.hibernate.annotations.CascadeType.LOCK;
import static org.hibernate.annotations.CascadeType.PERSIST;
import static org.hibernate.annotations.CascadeType.REFRESH;
import static org.hibernate.annotations.CascadeType.REMOVE;
import static org.hibernate.annotations.CascadeType.REPLICATE;
import static org.hibernate.annotations.CascadeType.SAVE_UPDATE;

/**
 * @author danieltaub on 22/03/2018.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class B {
    @Id
    private String id;

    @OneToOne
    @Cascade({DETACH, PERSIST, REMOVE, REFRESH, DELETE, REPLICATE, DETACH, LOCK})
    private C c;

    @ManyToOne
    private A entityA;
}
