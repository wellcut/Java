package review;

public class TossCard extends Card{
	String company = "Toss";
	String cardStaff;
	
	TossCard(String cardNo, int validDate, int cvc, String cardStaff ) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, "+cardNo);
		System.out.println("담당 직원 - " + cardStaff+", " + company);
	}
}
