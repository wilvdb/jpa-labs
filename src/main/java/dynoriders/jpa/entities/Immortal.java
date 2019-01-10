package dynoriders.jpa.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
public class Immortal {

    @Id
    long id;
    String name;
    int age;
    boolean dead;
    // TODO - resolve this (unidirectionnal) relationship first
    //Collection<Quickening> quickenings = new ArrayList<>();
}
