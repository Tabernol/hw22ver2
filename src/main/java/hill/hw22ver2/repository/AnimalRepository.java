package hill.hw22ver2.repository;

import hill.hw22ver2.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
