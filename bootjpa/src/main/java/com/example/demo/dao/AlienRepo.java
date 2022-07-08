package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Alien;
import java.util.*;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	List<Alien> getByAidGreaterThan(int aid);
	List<Alien> getByAname(String aname);
	List<Alien> getByAlang(String alang);
	
	@Query("from Alien order by aname")
	List<Alien> SortDataAccName();
}
