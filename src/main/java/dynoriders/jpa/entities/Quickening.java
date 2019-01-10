package dynoriders.jpa.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Quickening {

    @Id
    long id;
    long power;
    // TODO - and resolve this (bidirectional) relationship
    //Immortal immortal;
}
