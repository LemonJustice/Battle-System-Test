package entity;

public class Player {
	/*
	 * /=5        \= 6  
	 *       --=5
	 *   |=3  M  |=2
	 *       --=1     
	 * \=7         /=8
	 */
	
	String job;
	int weapon;
	int pos;
	int armor;

	public void Player(String job, int weapon, int armor, int pos) {
		job = this.job;
		weapon = this.weapon;
		armor = this.armor;
		pos = this.pos;
	}
}
