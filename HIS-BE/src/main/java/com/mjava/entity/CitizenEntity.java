package com.mjava.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="CITIZEN")
public class CitizenEntity {
	@Id
	@GeneratedValue
	//@Column(name="CITIZEN_ID")
	private Integer citizenId;
	
	//@Column(name="CITIZEN_NAME")
	private String citizenName;
	
	//@Column(name="CITIZEN_SSN")
	private String citizenSsn;
	
	//@Column(name="CITIZEN_PH_NUMBER")
	private long citizenPhNumber;
	
	//@Column(name="CITIZEN_ADDRESS")
	private String citizenAddress;
	
	@Column(name = "CREATE_DT",updatable = false)
	@CreationTimestamp
	private Date createdDate;

	@Column(name = "UPDATE_DT",insertable = false)
	@UpdateTimestamp
	private Date updatedDate;

}
