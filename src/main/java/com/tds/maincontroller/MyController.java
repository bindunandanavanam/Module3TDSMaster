package com.tds.maincontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tds.exception.IdNotFoundException;
import com.tds.model.TdsMaster;
import com.tds.service.TdsService;

@RestController
public class MyController {
	@Autowired
	TdsService service;
	
	//method for fetching the data from TDS_MASTER Table
	@GetMapping("/user/{id}")    
	public TdsMaster getByPid(@PathVariable int id) throws IdNotFoundException {
		
		TdsMaster tdsmaster = service.getById(id);
		//If tdsmaster is null
		if(tdsmaster==null) {
			throw new IdNotFoundException("ID Not found Wrong ID:  "+id);
		}
		else
			return tdsmaster;
		
	}

}





	
	
	
	

