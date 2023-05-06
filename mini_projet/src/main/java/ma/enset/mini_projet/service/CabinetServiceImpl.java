package ma.enset.mini_projet.service;

import lombok.AllArgsConstructor;
import ma.enset.mini_projet.entities.Consultation;
import ma.enset.mini_projet.entities.Medcin;
import ma.enset.mini_projet.entities.Patient;
import ma.enset.mini_projet.repositories.ConsultationRepositpry;
import ma.enset.mini_projet.repositories.MedcinRepository;
import ma.enset.mini_projet.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class CabinetServiceImpl implements ICabinetService{
    PatientRepository patientRepository;
    ConsultationRepositpry consultationRepositpry;
    MedcinRepository medcinRepository;
    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public List<Patient> seachByQuery(String query) {
        return null;
    }

    @Override
    public void addPatient(Patient patient) {

    }

    @Override
    public void deletePatientById(Long id) {

    }

    @Override
    public List<Consultation> getConsultationsByPatient(Patient patient) {
        return null;
    }

    @Override
    public void addMedcin(Medcin medcin) {

    }

    @Override
    public List<Medcin> getAllMedcins() {
        return null;
    }

    @Override
    public void deleteMedcinById(Long id) {

    }

    @Override
    public List<Consultation> getConsultationByMedcin(Medcin medcin) {
        return null;
    }

    @Override
    public void addConsultation(Consultation consultation) {

    }

    @Override
    public List<Consultation> getAllConsultations() {
        return null;
    }

    @Override
    public void deleteConsultation(Consultation consultation) {

    }
}
