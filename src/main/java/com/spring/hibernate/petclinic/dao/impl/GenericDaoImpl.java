package com.spring.hibernate.petclinic.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.spring.hibernate.petclinic.dao.GenericDao;

public class GenericDaoImpl<E> implements GenericDao<E>{
	
	private EntityManager em;
	private Class<E> clazz;
	
	public GenericDaoImpl(){
		ParameterizedType t = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<E>) t.getActualTypeArguments()[0];
	}
	
	@Override
	public void save(E e) {
		
	}

	@Override
	public void delete(long id) {
		
	}

	@Override
	public E findById(long id) {
		return em.find(clazz, new Long(id).intValue());
	}

	@Override
	public List<E> findAll() {
		List<E> list = new ArrayList<E>();
		String hql = "From "+clazz.getSimpleName();
		Query query = em.createQuery(hql);
		list = query.getResultList();
		return list;
	}
	
	protected void setEntityManager(EntityManager em){
		this.em = em;
	}
}
