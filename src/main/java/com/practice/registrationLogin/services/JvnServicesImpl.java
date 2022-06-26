package com.practice.registrationLogin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.registrationLogin.entity.Jvnregistration;
import com.practice.registrationLogin.repository.JvnRepository;

@Service
public class JvnServicesImpl implements JvnServices {
	
	@Autowired
	private JvnRepository repo;
	
	@Override
	public void save(Jvnregistration jnv) {
		// TODO Auto-generated method stub
		 repo.save(jnv);
	}

	@Override
	public Jvnregistration Jvnregistration(String username, String password) {
		// TODO Auto-generated method stub
		Jvnregistration findByUsernameAndPassword = repo.findByUsernameAndPassword(username, password);
		return findByUsernameAndPassword;
	}

//	@Override
//	public void Jvnregistration(String username, String password) {
//		// TODO Auto-generated method stub
//		Jvnregistration jnv = repo.findByUsernameAndPassword(username, password);
//		return jnv;
//	}

	
	
	
	
}
