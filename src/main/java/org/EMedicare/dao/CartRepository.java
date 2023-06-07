package org.EMedicare.dao;

import org.EMedicare.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	Cart findByMedicineId(int MedicineId) ;
}