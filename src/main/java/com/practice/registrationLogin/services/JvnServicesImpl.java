package com.practice.registrationLogin.services;

import java.util.List;
import java.util.Optional;
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

//	@Override
//	public Jvnregistration Jvnregistration(String username, String password) {
//		// TODO Auto-generated method stub
//		Jvnregistration findByUsernameAndPassword = repo.findByUsernameAndPassword(username, password);
//		return findByUsernameAndPassword;
//	}

	@Override
	public List<Jvnregistration> getAllJnvregistration() {
		// TODO Auto-generated method stub
		List<Jvnregistration> jnv = repo.findAll();
		return jnv;
	}

	@Override
	public void deleteJnvregistrationById(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Jvnregistration getJnvregistrationById(long id) {
		// TODO Auto-generated method stub
		Optional<Jvnregistration> findById = repo.findById(id);
		Jvnregistration jvn = findById.get();
		return jvn;
	}

//	@Override
//	public Optional<Jvnregistration> findById(long id) {
//		// TODO Auto-generated method stub
//		//Optional<Leads> findById = leadRepository.findById(id);
//		//Leads leads = findById.get();
//		//Optional<Jvnregistration> findById = repo.findById(id);
//		//Jvnregistration jvnregistration = findById.get();
//		java.util.Optional<com.practice.registrationLogin.entity.Jvnregistration> findById = repo.findById(id);
//		com.practice.registrationLogin.entity.Jvnregistration jvn = findById.get();
//		return jvn;
//	}

//	@Override
//	public void Jvnregistration(String username, String password) {
//		// TODO Auto-generated method stub
//		Jvnregistration jnv = repo.findByUsernameAndPassword(username, password);
//		return jnv;
//	}

	
	
	
	
}
