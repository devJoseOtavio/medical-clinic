package medicalClinic.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressData (

        @NotBlank
        String publicplace,

        @NotBlank
        String neighborhood,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String zipcode,

        @NotBlank
        String city,

        @NotBlank
        String state,
        String number,
        String complement
    ) {
}
