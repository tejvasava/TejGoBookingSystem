package com.tejgo.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejgo.main.core.Driver;

@Repository
public interface DriverRepository  extends JpaRepository<Driver, Long>{
	
	List<Driver> findByStatus(String status);
}
