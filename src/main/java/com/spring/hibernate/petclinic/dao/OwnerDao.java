package com.spring.hibernate.petclinic.dao;

import java.util.List;

import com.spring.hibernate.petclinic.entity.Owner;

public interface OwnerDao extends GenericDao<Owner>{
	public List<Owner> findByLastName(String lastName);
}
