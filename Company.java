package com.anuja;

import org.springframework.beans.factory.annotation.Autowired;



public class Company {

	private int ComId;
	private String comName;
	@Autowired
	private Employee empOb;
	
	
	public int getComId() {
		return ComId;
	}

	public void setComId(int comId) {
		ComId = comId;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Employee getEmpOb() {
		return empOb;
	}
	public void setEmpOb(Employee empOb) {
		this.empOb = empOb;
	}
	
	public void print()
	{
		System.out.println(ComId);
		System.out.println(comName);
		System.out.println(empOb);
		
	}
}
