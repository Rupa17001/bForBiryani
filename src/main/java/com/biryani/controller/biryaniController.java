// Controller Class
//it has API
//feeds data and retrived data from DB

package com.biryani.controller;


import java.util.List;
import java.util.Optional;

import com.biryani.model.biryaniModel;
import com.biryani.service.biryaniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class biryaniController {
	
	
	@Autowired
	private biryaniService service;
	//adds biryani data
	@RequestMapping(method=RequestMethod.POST,value="/biryani")
	public String addBiryani(@RequestBody biryaniModel b1) {
		return service.addBiryani(b1);
	}
	//adds all biryani data together
	@RequestMapping(method=RequestMethod.POST,value="/all/biryani")
	public String addAllBiryani(@RequestBody List<biryaniModel>  b1) {
		return service.addAllBiryani(b1);
	}
	//retrieves All biryan from DB
	@RequestMapping(method=RequestMethod.GET,value="/biryanis")
	public List<biryaniModel> getAllBiryanis(){
		return service.getAllBiryanis();
	}
	//retrieves biryani data based on the biryaniId 
	@RequestMapping(method=RequestMethod.GET,value="/biryani/Id/{id}")
	public Optional<biryaniModel> getBiryaniById(@PathVariable int id) {
		return service.getBiryaniById(id);
	}
	//retrieves Biryani data based on the biryanitype
	@RequestMapping(method=RequestMethod.GET,value="/biryani/Type/{type}")
	public List<biryaniModel> getBiryaniByType(@PathVariable String type){
		return service.getBiryaniByType(type);
	}
	//retrives biryani data comes under the specific price range
	@RequestMapping (method=RequestMethod.GET,value="/biryani/range/{bPrice}")
	public List<biryaniModel> getBiryaniInRange(@PathVariable int bPrice){
		return service.getBiryaniInRange(bPrice);
	}
}


