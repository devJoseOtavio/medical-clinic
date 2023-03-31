package medicalClinic.api.doctor;

public record DoctorDataList(Long id, String name, String email, String crm, Speciality speciality) {
    public DoctorDataList(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpeciality());
    }
}
