package com.practice.registrationLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.registrationLogin.entity.Jvnregistration;

@Repository
public interface JvnRepository extends JpaRepository<Jvnregistration, Long> {
	
	Jvnregistration findByUsernameAndPassword(String username, String password);
}
