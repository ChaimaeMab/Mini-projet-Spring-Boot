package ma.enset.mini_projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    private String description;
    @ManyToOne
    private Medcin medcin;
    @ManyToOne
    private Patient patient;
}
