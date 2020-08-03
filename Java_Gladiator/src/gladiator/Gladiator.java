package gladiator;

import java.util.Random;

public class Gladiator {

	protected String name;
	public int healthPoint;
	public int attackPoint;
	
	
	public Gladiator(String name) {
		this.name = name;
		this.healthPoint = 100;
		
		/** [1-5] */
		this.attackPoint = (new Random().nextInt(5) + 1);
	}


	public void attacked(int enemyAttackPower)
	{
		this.healthPoint = (this.healthPoint - enemyAttackPower);
	}
	

	public int getHealthPoint() {
		return healthPoint;
	}


	public int getAttackPoint() {
		return attackPoint;
	}


	public String getName() {
		return name;
	}
	
	
	
	
}
