package dynoriders.jpa.repositories;

import dynoriders.jpa.entities.MyEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends PagingAndSortingRepository<MyEntity, Long> {
}
