package dynoriders.jpa.repositories;

import dynoriders.jpa.entities.Immortal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmortalRepository extends PagingAndSortingRepository<Immortal, Long> {
}
