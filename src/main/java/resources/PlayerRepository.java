package resources;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


//Player JPA Entity
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer  > {


}
