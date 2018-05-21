package data;

public class Weapons {
	// {mle, rng,  mag, spd, def, res, spc}
	private int[] stats = new int[7];
	public int[] getWeaponStats(int id) {
		switch(id){
			case 0:
				stats[0] = 3;
				stats[1] = 1;
				stats[2] = 0;
				stats[3] = 2;
				stats[4] = 1;
				stats[5] = 0;
				stats[6] = 0;
				return stats;
			case 1:
				stats[0] = 0;
				stats[1] = 2;
				stats[2] = 1;
				stats[3] = 0;
				stats[4] = 0;
				stats[5] = 3;
				stats[6] = 1;
				return stats;
			default:
				stats[0] = 0;
				stats[1] = 0;
				stats[2] = 0;
				stats[3] = 0;
				stats[4] = 0;
				stats[5] = 0;
				stats[6] = 0;
				return stats;
		}
			
	}
}
