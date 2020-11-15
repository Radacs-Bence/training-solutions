package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    List<Pet> patients = new ArrayList<>();

    private boolean areEquals(Pet patient, Pet newPatient){
        boolean equals = false;
        String patientRN = patient.getRegistrationNumber();
        String newPatientRN = newPatient.getRegistrationNumber();
        if (newPatientRN.equals(patientRN)){
            equals = true;
        }
        return equals;
    }

    public void add(Pet newPatient){
        String newPatientRN = newPatient.getRegistrationNumber();
        boolean isNew = true;
        for (Pet patient: patients) {
            if (areEquals(patient, newPatient)){
                isNew = false;
            }
        }
        if (isNew){
            patients.add(newPatient);
        }

    }

    public List<Pet> getPets() {
        return patients;
    }
}
