package medicalClinic.api.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medicalClinic.api.address.Address;

@Table(name = "patients")
@Entity(name = "patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cpfcnpj;

    private String telephone;

    @Embedded
    private Address address;

    public Patient(PatientRegistrationData data) {
        this.name = data.name();
        this.cpfcnpj = data.cpfcnpj();
        this.telephone = data.telephone();
        this.address = data.address();
    }

    public void updatePatient(DataUpdatePatient data) {
        if (data.id() != null) this.id = data.id();

        if (data.name() != null) this.name = data.name();

        if (data.cpfcnpj() != null) this.cpfcnpj = data.cpfcnpj();

        if(data.address() != null) this.address.update(data.address());
    }
}
