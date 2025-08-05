package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.repository.ITouristRepo;
@Service
public class TouristServiceImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo touristRepo;

	@Override
	public String registerTourist(Tourist tourist) {
		int idVal = touristRepo.save(tourist).getTid();
		return "tourist is saved with idVal :  " +idVal;
		
		
	}

	@Override
	public List<Tourist> getAllTourist() {
	List<Tourist> list=touristRepo.findAll();
	list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));//sorting in ascending order
		return list;
	}
	
	
	
}
