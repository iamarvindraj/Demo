package com.cg.entity;

import com.cg.intf.Certification;

public class Developer extends Employee implements Certification{
	
	protected int noOfProjectsDone;
	
	public Developer(int noOfProjectsDone) {
		super();
		this.noOfProjectsDone = noOfProjectsDone;
	}

	@Override
	public void getCertification(String cname) {
		// TODO Auto-generated method stub
		
	}
	

}
