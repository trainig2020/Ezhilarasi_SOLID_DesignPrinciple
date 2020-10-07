package com.ezhil;

public class OnlinePaymentImpl implements OnlinePayment {

	@Override
	public void payForOrder() {
		// TODO Auto-generated method stub
		OnlinePayment.super.payForOrder();
		System.out.println("Only Online Payment is acceptable");
	}

	
}
