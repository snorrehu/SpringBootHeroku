package resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Player JPA Entity
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer  > {


}
