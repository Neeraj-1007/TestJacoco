package com.example.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserDTO;

@Repository
public class UserRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	public UserRepo(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public void save(UserDTO dto) {
		
		entityManager.persist(dto);
		
		
	}
	

}
