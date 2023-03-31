package medicalClinic.api.doctor;

import jakarta.persistence.*;
import lombok.*;
import medicalClinic.api.address.Address;

@Table(name = "doctors")
@Entity(name = "doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String telephone;

    private String crm;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @Embedded
    private Address address;

    public Doctor(DoctorRegistrationData data) {
        this.name = data.name();
        this.email = data.email();
        this.telephone = data.telephone();
        this.crm = data.crm();
        this.speciality = data.speciality();
        this.address = new Address(data.address());
    }

    public void updateDoctor(DataUpdateDoctor data) {
        if (data.name() != null) this.name = data.name();

        if (data.telephone() != null) this.telephone = data.telephone();

        if (data.address() != null) this.address.updateDoctor(data.address());
    }
}
