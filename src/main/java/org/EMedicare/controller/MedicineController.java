package org.EMedicare.controller;

import java.util.List;

import org.EMedicare.entity.Medicines;
import org.EMedicare.services.MedicineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class MedicineController {
private MedicineService medicineService;

public MedicineController(MedicineService medicineService) {
	super();
	this.medicineService = medicineService;
}
@PostMapping("/medicines")
public Medicines insert(@RequestBody Medicines medicines)
{
	medicineService.insertMedicines(medicines);
	return medicines;
}
@GetMapping("/medicines")
public List<Medicines> getMedicineDetails() 
{
	List<Medicines> medicines = medicineService.getMedicineDetails();
	return medicines;
}

@GetMapping("/medicines/{medicineId}")
public Medicines getMedicineById(@PathVariable("medicineId") int medicineId) {	
	
	Medicines M = medicineService.findById(medicineId);
	return M;
}
@DeleteMapping("/medicines/{medicineId}")
public ResponseEntity<Object> deleteMedicine(@PathVariable("medicineId") int medicineId) {
	medicineService.deleteMedicines(medicineId);
	return new ResponseEntity<>("deleted successsfully", HttpStatus.OK);
	}
{
	
}
@PutMapping("/medicines")
public Medicines update(@RequestBody Medicines medicine)
{
	medicineService.updateMedicines(medicine);
	return medicine;
}
}
