package appSpring.repository;

import java.util.List;
import entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

	List<Genre> findByName(String name);

}
