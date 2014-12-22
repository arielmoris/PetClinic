package com.spring.hibernate.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.petclinic.dao.OwnerDao;
import com.spring.hibernate.petclinic.entity.Owner;
import com.spring.hibernate.petclinic.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService{
	
	@Autowired
	public OwnerDao ownerDao;
	
	@Override
	@Transactional
	public List<Owner> findByLastName(String lastName) {
		return ownerDao.findByLastName(lastName);
	}
	
	@Override
	@Transactional
	public Owner findById(int id) {
		return ownerDao.findById(id);
	}

}
