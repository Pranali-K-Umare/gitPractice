package com.example.joinsql.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.joinsql.dto.OrderRequest;
import com.example.joinsql.repository.CustomerRepository;
import com.example.joinsql.repository.ProductRepository;
import com.example.joinsql.servicei.homeservicei;
@Service
public class homeserviceimpl implements homeservicei {
	
	@Autowired
	private CustomerRepository cr;
	
	@Autowired
	private ProductRepository pr;
	
	public void saveCustdata(OrderRequest r)
	{
		cr.save(r.getCustomer());
	}

}
