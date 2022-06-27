package com.practice.registrationLogin.services;

import java.util.List;

import com.practice.registrationLogin.entity.Jvnregistration;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public interface JvnServices {

	public void save(Jvnregistration jnv);

	//public Jvnregistration Jvnregistration(String username, String password);

	public List<Jvnregistration> getAllJnvregistration();

	public void deleteJnvregistrationById(long id);

	public Jvnregistration getJnvregistrationById(long id);

	//public Optional<Jvnregistration> findById(long id);

	

}
