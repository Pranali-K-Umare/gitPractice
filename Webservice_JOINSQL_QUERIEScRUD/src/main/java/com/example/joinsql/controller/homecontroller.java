package com.example.joinsql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.joinsql.dto.OrderRequest;
import com.example.joinsql.servicei.homeservicei;

@RestController
public class homecontroller {
	
	@Autowired
	private homeservicei hsi;
	
	@PostMapping("/insertCus")
	public String saveCusData(@RequestBody OrderRequest request )
	{
		System.out.println("gitpractice code");
		hsi.saveCustdata(request);
		return "save";
	}

        @GetMapping("/getCus")
        public List<Customer> getCustData()
        {

         List<Customer> clist=hsi.getAllCustData();
         return clist;

        }

     

}
