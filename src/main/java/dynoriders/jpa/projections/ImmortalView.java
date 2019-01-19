package dynoriders.jpa.projections;

import dynoriders.jpa.entities.Immortal;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "immortalView", types = Immortal.class)
public interface ImmortalView {

    String getName();

    int getAge();

    boolean isDead();

    long getPower();
}
