package com.valtech.training.hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TellerTx")
public class TellerTx extends Tx {
	
	private int teller;
	private int branch;
	
	public int getTeller() {
		return teller;
	}
	public void setTeller(int teller) {
		this.teller = teller;
	}
	
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	
	public TellerTx() {
	}

	public TellerTx(float amount,int teller, int branch) {
		super(amount);
		this.teller = teller;
		this.branch = branch;
	}
	

}
