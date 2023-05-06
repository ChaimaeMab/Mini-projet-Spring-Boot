package ma.enset.mini_projet;

import ma.enset.mini_projet.entities.Patient;
import ma.enset.mini_projet.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MiniProjetApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(MiniProjetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient p1 =  new Patient(null,"mabchour","chaimae","AD320266","0689913441","chaimaemabchour28@gmail.com",new Date(),null);
        patientRepository.save(p1);

        List<Patient> patients = patientRepository.findAll();
        for (Patient p:patients) {
            System.out.println(p.getNom()+" "+p.getPrenom()+" "+p.getEmail());
        }

        // Patient p = patientRepository.findById(2l).get();
        // p.setPrenom("Khadija");
        //patientRepository.save(p);

        //patientRepository.deleteAllById(2l);
    }
}
