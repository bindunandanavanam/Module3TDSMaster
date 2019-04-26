package com.tds.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tds.model.TdsMaster;

@Component("dao")
@Repository
@ComponentScan("com")
public class TdsDaoImpl implements TdsDao{

	@PersistenceContext
	EntityManager entityManager;

	//method to fetch details from DataBase using entity manager
	@Override
	public TdsMaster getById(int id) {
		TdsMaster tdsMaster=entityManager.find(TdsMaster.class, id);
		return tdsMaster;
	}
	

}
