package ma.enset.mini_projet.repositories;

import ma.enset.mini_projet.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepositpry extends JpaRepository<Consultation,Long> {
}
