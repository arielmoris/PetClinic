package com.spring.hibernate.petclinic.service;

import java.util.List;

import com.spring.hibernate.petclinic.entity.Owner;

public interface OwnerService{
	public List<Owner> findByLastName(String lastName);
	public Owner findById(int id);
}
