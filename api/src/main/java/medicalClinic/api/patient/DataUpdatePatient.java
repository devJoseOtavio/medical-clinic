package medicalClinic.api.patient;

import jakarta.validation.constraints.NotNull;
import medicalClinic.api.address.AddressData;

public record DataUpdatePatient(@NotNull Long id, String name, String cpfcnpj, AddressData address) {
}
