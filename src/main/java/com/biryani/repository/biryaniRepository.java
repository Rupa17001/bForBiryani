//JPA Repository
//Encapsulates Logic to access data
//Reduces boilerplates

package com.biryani.repository;


import java.util.List;

import com.biryani.model.biryaniModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
	@Repository
	public interface biryaniRepository extends JpaRepository<biryaniModel,Integer> {

		List<biryaniModel> findBybiryaniType(String type);
		@Query(value = "Select * from biryani_Model where biryani_Price < ?1", nativeQuery = true)
		List<biryaniModel> findBybiryaniPrice(int bPrice);
		
	}


