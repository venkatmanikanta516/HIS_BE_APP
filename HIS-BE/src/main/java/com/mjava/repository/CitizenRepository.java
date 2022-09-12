package com.mjava.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjava.entity.CitizenEntity;
@Repository
public interface CitizenRepository extends JpaRepository<CitizenEntity, Serializable>{

}
