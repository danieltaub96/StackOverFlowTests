package hibernate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static org.hibernate.annotations.CascadeType.DELETE;
import static org.hibernate.annotations.CascadeType.DETACH;
import static org.hibernate.annotations.CascadeType.LOCK;
import static org.hibernate.annotations.CascadeType.PERSIST;
import static org.hibernate.annotations.CascadeType.REFRESH;
import static org.hibernate.annotations.CascadeType.REMOVE;
import static org.hibernate.annotations.CascadeType.REPLICATE;
import static org.hibernate.annotations.CascadeType.SAVE_UPDATE;

/**
 * @author danieltaub on 19/03/2018.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class A {
    @Id
    private String id;

    @OneToMany(fetch = LAZY)
    @Cascade({DETACH, PERSIST, REMOVE, REFRESH, DELETE, REPLICATE, SAVE_UPDATE, DETACH, LOCK})
    private List<B> b;
}
