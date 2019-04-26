package com.tds.service;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tds.dao.TdsDao;
import com.tds.model.TdsMaster;

@Component("service")
@Service
@Transactional
public class TdsServiceImpl implements TdsService {

	@Autowired
	TdsDao dao;
	
	@Override
	public TdsMaster getById(int id) {
		return dao.getById(id);
	}

	

}
