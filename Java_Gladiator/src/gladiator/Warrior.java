package gladiator;


public class Warrior extends Gladiator {

	public Warrior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public int lowAttackPoint() {
		
		if(healthPoint < 20 ) {
			
			attackPoint = attackPoint * 2;
		}
		
		return attackPoint;
	}

}
