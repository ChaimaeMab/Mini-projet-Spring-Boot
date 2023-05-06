package ma.enset.mini_projet.repositories;

import ma.enset.mini_projet.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
