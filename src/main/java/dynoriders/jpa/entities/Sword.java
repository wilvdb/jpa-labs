package dynoriders.jpa.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Sword {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    LocalDate creationDate;
    String name;
    @Version
    int version;
}
