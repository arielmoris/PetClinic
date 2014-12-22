package com.spring.hibernate.petclinic.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.spring.hibernate.petclinic.dao.OwnerDao;
import com.spring.hibernate.petclinic.entity.Owner;

@Repository
public class OwnerDaoImpl extends GenericDaoImpl<Owner> implements OwnerDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){
		super.setEntityManager(em);
	}
	
	@Override
	public List<Owner> findByLastName(String lastName) {
		List<Owner> list = new ArrayList<Owner>();
		String sql = "From Owner where lastName like :lastName";
		Query query = em.createQuery(sql).setParameter("lastName", lastName+"%");
		list = query.getResultList();
		return list;
	}

}
