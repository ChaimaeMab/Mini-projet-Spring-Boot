package ma.enset.mini_projet.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
public class Medcin {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    @OneToMany(mappedBy = "medcin")
    private Collection<Consultation> consultation;
}
