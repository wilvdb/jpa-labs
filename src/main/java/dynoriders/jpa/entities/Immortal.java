package dynoriders.jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Immortal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String name;
    int age;
    boolean dead;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "IMMORTAL_QUICKENING",
            joinColumns = @JoinColumn(name = "QUICKENING_ID"),
            inverseJoinColumns = @JoinColumn(name = "IMMORTAL_ID"))
    List<Quickening> quickenings = new ArrayList<>();
    @OneToOne(cascade = CascadeType.PERSIST)
    Sword sword;
}
