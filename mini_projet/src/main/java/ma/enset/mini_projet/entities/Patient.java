package ma.enset.mini_projet.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Collection;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
//@Table(name = "Patients")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String nom;
    @Column(length = 100)
    private String prenom;
    private String cin;
    private String tel;
    @Column(length = 100)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date DateNaissance;
    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> consultation;

}
