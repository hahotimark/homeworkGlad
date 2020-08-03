package gladiator;

import java.util.Random;

public class Paladin extends Gladiator {

	public Paladin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public void attacked(int enemyAttackPower)
	{
		this.healthPoint = (this.healthPoint - enemyAttackPower + 1);
	}
	
	
	
}
