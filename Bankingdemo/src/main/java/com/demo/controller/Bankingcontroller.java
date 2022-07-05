package com.demo.controller;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Bankingmodel;
import com.demo.repository.Bankinginterface;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Bankingcontroller 
{

	@Autowired
	private Bankinginterface binterface;
	
		
	@PostMapping("deposit")
	@CrossOrigin(origins="http://localhost:4200")
	public Bankingmodel deposit(@RequestBody Bankingmodel bmodel )
	{
		
		long id1 = bmodel.getAccno(); 
		String name1 = bmodel.getAccname();
		double bal1 = bmodel.getAccbalance();
		
		double bal2 = oldbalance(id1);            // oldbalance function
		bal1 = bal1+bal2;
		bmodel.setAccno(id1);
		bmodel.setAccname(name1);
		bmodel.setAccbalance(bal1);
		
		return binterface.save(bmodel);
	}
	
	public double oldbalance(long id2)
	{
		Bankingmodel bmodel2 = this.binterface.getById(id2);
		return   (bmodel2.getAccbalance());
	}

	@PostMapping("withdrawl")
	@CrossOrigin(origins="http://localhost:4200")
	public Bankingmodel withdrawl(@RequestBody Bankingmodel bmodel3)
	{
		long id2 = bmodel3.getAccno();
		String name2 = bmodel3.getAccname();
		double bal3 = bmodel3.getAccbalance();
		double bal4= oldbalance1(id2);
		bal3 = bal4-bal3;
		bmodel3.setAccno(id2);
		bmodel3.setAccname(name2);
		bmodel3.setAccbalance(bal3);
		return binterface.save(bmodel3);
		
	}
	public double oldbalance1(long id4)
	{
		Bankingmodel bmodel5=   this.binterface.getById(id4);
	     return bmodel5.getAccbalance();
	}
	
	@GetMapping("view")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Bankingmodel> view()
	{
		return binterface.findAll(); 
	}
	
}
