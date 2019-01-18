package dynoriders.jpa.repositories;

import dynoriders.jpa.entities.Sword;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwordRepository extends PagingAndSortingRepository<Sword, Long> {

}
