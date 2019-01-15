package dynoriders.jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Quickening {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    long power;
    @ManyToMany
    @JoinTable(name = "IMMORTAL_QUICKENING",
            joinColumns = @JoinColumn(name = "IMMORTAL_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUICKENING_ID"))
    List<Immortal> immortals;
}
