package medicalClinic.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import medicalClinic.api.patient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid PatientRegistrationData data) {
        repository.save(new Patient(data));
    }

    @GetMapping
    public Page<PatientDataList> patientList(@PageableDefault(size = 10, sort = {"name"}) Pageable paginate) {
        return repository.findAll(paginate).map(PatientDataList::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdatePatient data) {
        var patient = repository.getReferenceById(data.id());
        patient.updatePatient(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
