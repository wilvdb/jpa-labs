package dynoriders.jpa.repositories;

import dynoriders.jpa.entities.Immortal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmortalRepository extends PagingAndSortingRepository<Immortal, Long> {

    @Query("select sum(q.power) from Immortal i join i.quickenings q where i.id = :immortalId")
    long getTotalQuickeningById(@Param("immortalId") long id);
}
