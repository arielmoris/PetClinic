package com.spring.hibernate.petclinic.dao;

import java.util.List;

public interface GenericDao<E> {
	public void save(E e);
	public void delete(long id);
	public E findById(long id);
	public List<E> findAll();
}
