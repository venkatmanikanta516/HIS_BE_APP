package com.mjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.entity.CitizenEntity;
import com.mjava.repository.CitizenRepository;

 
public interface CitizenService {
	 
	public CitizenEntity insertCitizenService(CitizenEntity citizen);
	 

}
