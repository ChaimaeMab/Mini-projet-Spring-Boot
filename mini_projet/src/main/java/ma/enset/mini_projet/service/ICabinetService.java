package ma.enset.mini_projet.service;

import ma.enset.mini_projet.entities.Consultation;
import ma.enset.mini_projet.entities.Medcin;
import ma.enset.mini_projet.entities.Patient;

import java.util.List;

public interface ICabinetService {
    List<Patient> getAllPatients();
    List<Patient> seachByQuery(String query);
    void addPatient(Patient patient);
    void deletePatientById(Long id);
    List<Consultation> getConsultationsByPatient(Patient patient);
    void addMedcin(Medcin medcin);
    List<Medcin> getAllMedcins();
    void deleteMedcinById(Long id);
    List<Consultation> getConsultationByMedcin(Medcin medcin);
    void addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    void deleteConsultation(Consultation consultation);
}
