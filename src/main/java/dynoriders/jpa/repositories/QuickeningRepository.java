package dynoriders.jpa.repositories;

import dynoriders.jpa.entities.Quickening;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuickeningRepository extends PagingAndSortingRepository<Quickening, Long> {
}
