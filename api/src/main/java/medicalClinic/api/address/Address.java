package medicalClinic.api.address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String publicplace;

    private String neighborhood;

    private String zipcode;

    private String number;

    private String complement;

    private String city;

    private String state;

    public Address(AddressData data) {
        this.publicplace = data.publicplace();
        this.neighborhood = data.neighborhood();
        this.zipcode = data.zipcode();
        this.number = data.number();
        this.complement = data.complement();
        this.city = data.city();
        this.state = data.state();
    }

    public void updateDoctor(AddressData data) {
        if (data.publicplace() != null) this.publicplace = data.publicplace();
        if (data.neighborhood() != null) this.neighborhood = data.neighborhood();
        if (data.zipcode() != null) this.zipcode = data.zipcode();
        if (data.number() != null) this.number = data.number();
        if (data.complement() != null) this.complement = data.complement();
        if (data.city() != null) this.city = data.city();
        if (data.state() != null) this.state = data.state();

    }
}
