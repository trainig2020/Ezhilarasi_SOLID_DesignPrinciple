package com.ezhil;

public class InPersonImpl implements InPersonPayment{

	@Override
	public void payForOrder() {
		// TODO Auto-generated method stub
		InPersonPayment.super.payForOrder();
		System.out.println("Only In Person Payment is Acceptable");
	}

}
