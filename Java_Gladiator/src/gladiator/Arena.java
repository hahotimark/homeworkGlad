package gladiator;

public class Arena {

	public Gladiator fight(Gladiator g1, Gladiator g2)
	{
		Gladiator winner = null;
		
		
		/** FIGHT */
		
		
		while( (g1.getHealthPoint() > 0) && (g2.getHealthPoint() > 0) )
		{
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("HP: " + g1.healthPoint);
			System.out.println("HP2: " + g2.healthPoint);
			
			/** G1 attacks G2 */
			g2.attacked( g1.getAttackPoint() );
			
			/** G2 attacks G1 */
			g1.attacked( g2.getAttackPoint() );
		}
		
		/** FIGHT */
		
		
		/** G2 is dead? */
		if( g2.getHealthPoint() <= 0 )
		{
			winner = g1;
		}
		else
		{
			winner = g2;
		}
				
		
		return winner;
	}
	
}
