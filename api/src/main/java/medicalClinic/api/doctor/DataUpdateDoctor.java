package medicalClinic.api.doctor;

import jakarta.validation.constraints.NotNull;
import medicalClinic.api.address.AddressData;

public record DataUpdateDoctor(@NotNull Long id, String name, String telephone, AddressData address) {
}
