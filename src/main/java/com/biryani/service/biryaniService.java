//Service Layer
// Facilitates communication between Controller and Persistence Layer(Repository) 
// Methods in this class connect methods of the controller class to Repository
package com.biryani.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.biryani.model.biryaniModel;
import com.biryani.repository.biryaniRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class biryaniService {
	@Autowired
	private biryaniRepository biryaniRepo;
	//add biryani to DB
	public String addBiryani(biryaniModel b1) {
		biryaniRepo.save(b1);
		return "Biryani Added";
	}
	//adds all (differentvtype of )biryani together
	public String addAllBiryani(List <biryaniModel> b1) {
		biryaniRepo.saveAll(b1);
		return "All Biryanis are Added";
	}
	//fetches all biryani from table
	public List<biryaniModel> getAllBiryanis(){
		List<biryaniModel> allbiryanis = new ArrayList<>();
		biryaniRepo.findAll().forEach(allbiryanis::add);
		return allbiryanis;
	}
	//fetches biryani by biryaniId
	public Optional<biryaniModel> getBiryaniById(int id) {
		return biryaniRepo.findById(id);
	}
	//fetches biryani by biryaniType
	public List<biryaniModel> getBiryaniByType(String type){
		return biryaniRepo.findBybiryaniType(type);	
	}
	//fetches biryani which are under specific Price range
	public List<biryaniModel> getBiryaniInRange (int bPrice){
		return biryaniRepo.findBybiryaniPrice(bPrice);
	}
	
}