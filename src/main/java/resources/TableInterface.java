package resources;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TableInterface extends CrudRepository {

    List<String> findByLastName(@Param("lastname") String lastname);
}
