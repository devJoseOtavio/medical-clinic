package medicalClinic.api.patient;

public record PatientDataList(String name, String cpfcnpj) {
    public PatientDataList(Patient patient) {
        this(patient.getName(), patient.getCpfcnpj());
    }
}
