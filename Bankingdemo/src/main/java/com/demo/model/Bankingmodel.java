package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bankingmodel
{
	@Id
	private long accno;
	private String accname;
	private double accbalance;
	
		public Bankingmodel() {
		super();
		
	}
	public Bankingmodel(long accno, String accname, double accbalance) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.accbalance = accbalance;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}
	@Override
	public String toString() {
		return "Bankingmodel [accno=" + accno + ", accname=" + accname + ", accbalance=" + accbalance + "]";
	}
	
	

}
