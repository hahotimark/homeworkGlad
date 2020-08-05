package gladiator;

import java.util.Random;

public class Warrior extends Gladiator {
	
	public Warrior(String name) {
		super(name);
	}

	public int getAttackpoint() {
		this.name = name;
		this.healthPoint = 100;
		
		/** [1-5] */
		this.attackPoint = (new Random().nextInt(5) + 1);
		
		if(healthPoint < 20)
		{
			this.attackPoint = attackPoint + 20;
		}
		
		return attackPoint;
	}
	
	public int getAttackPoint() {
		return attackPoint;
	}

}
