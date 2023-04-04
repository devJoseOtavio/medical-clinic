package medicalClinic.api.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import medicalClinic.api.address.Address;

public record PatientRegistrationData(

        @NotBlank
        String name,

        @NotBlank
        @Pattern(regexp = "\\d{11,14}")
        String cpfcnpj,

        @NotBlank
        String telephone,

        @NotNull
        @Valid
        Address address
        ) {
}
