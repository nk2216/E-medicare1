package org.EMedicare.services;

import java.util.List;

import org.EMedicare.dao.MedicineRepository;
import org.EMedicare.entity.Medicines;
import org.springframework.stereotype.Service;
@Service
public class MedicineServiceImpl implements MedicineService{
private MedicineRepository medicineRepository;

public MedicineServiceImpl(MedicineRepository medicineRepository) {
	super();
	this.medicineRepository = medicineRepository;
}

@Override
public void insertMedicines(Medicines medicines) {
	medicineRepository.save(medicines);
	
}

@Override
public void updateMedicines(Medicines medicine) {
	//Medicines m =medicineRepository.findById(medicine.getMedicineId()).orElse(null);
	medicineRepository.save(medicine);
}

@Override
public void deleteMedicines(int medicineId) {
	//Medicines m = medicineRepository.getById(medicineId);
	medicineRepository.deleteById(medicineId);
}

@Override
public Medicines findById(int medicineId) {
	Medicines m = medicineRepository.findByMedicineId(medicineId);
	return m;
}

@Override
public List<Medicines> getMedicineDetails() {
	List<Medicines> medicines = medicineRepository.findAll();
	return medicines;
}
}