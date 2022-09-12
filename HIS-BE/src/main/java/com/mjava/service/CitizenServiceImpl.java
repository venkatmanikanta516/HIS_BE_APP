package com.mjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.entity.CitizenEntity;
import com.mjava.repository.CitizenRepository;
@Service
public class CitizenServiceImpl implements CitizenService {
	@Autowired
	public CitizenRepository citizenRepository;
	
	public CitizenEntity insertCitizenService(CitizenEntity citizen)
	{
		return  citizenRepository.save(citizen);
	}

}
