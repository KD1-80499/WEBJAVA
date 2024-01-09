package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Doctor;
import com.app.entities.Patient;

public interface DoctorDao extends JpaRepository<Doctor,Long>{

	 Doctor findbyName(String name);

}
