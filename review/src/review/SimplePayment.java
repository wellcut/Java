package review;

public class SimplePayment implements Payment {
	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
		System.out.println("***간편결제 시 할인정보");
	}

	@Override
	public int online(int price) {
		int result =	(int) (price * (1.0-(simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO)));
		return result;
		
	}

	@Override
	public int offline(int price) {
		int result =	(int) (price * (1.0-(simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO)));
		return result;
		
	}

	@Override
	public void showInfo() {
		System.out.println("온라인 결제시 총 할인율 : " + (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}
	
	
}
