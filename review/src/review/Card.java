package review;

public class Card {
	String cardNo;
	int validDate;
	int cvc;
	
	Card(String cardNo,int validDate, int cvc ){
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.println("카드저옵 ( Card NO : " +cardNo + ", 유효기간 : " + validDate + ", CVC : " + cvc );
	}
}

