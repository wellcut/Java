package review;

public class Application02 {
	public static void main(String[] args) {
		Card toss = new TossCard("5432-4567-9534-3657",20251203,253,"신빛용");
		toss.showCardInfo();
		
		Card dgb = new DGBCard("5432-4567-9534-3657", 20251203,253, "신빛용");
		dgb.showCardInfo();
		
	}
}	
