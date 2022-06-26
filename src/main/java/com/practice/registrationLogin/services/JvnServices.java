package com.practice.registrationLogin.services;

import com.practice.registrationLogin.entity.Jvnregistration;

public interface JvnServices {

	public void save(Jvnregistration jnv);

	public Jvnregistration Jvnregistration(String username, String password);

	

}
