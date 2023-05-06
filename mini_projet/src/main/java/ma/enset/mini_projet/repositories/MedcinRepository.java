package ma.enset.mini_projet.repositories;

import ma.enset.mini_projet.entities.Medcin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medcin,Long> {
}
