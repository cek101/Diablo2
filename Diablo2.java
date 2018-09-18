
public class Diablo2 {

	public static void main(String[] args) {
		
		Barbarian artyBarb = new Barbarian("artyTheDestroyer", 50, 100, 20);
		Amazon artyAmazon = new Amazon("FannyBitch", 20, 40, 90);
		
		
		artyBarb.killMonster(1);
		artyBarb.killMonster(2);
		artyBarb.calculateSquareFeet(2, 4);
		artyBarb.receivedSTD();
		artyBarb.stats();
		artyAmazon.stats();
		

	}

}
