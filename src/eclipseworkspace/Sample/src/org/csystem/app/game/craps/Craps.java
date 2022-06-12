package org.csystem.app.game.craps;

public class Craps {
	public boolean win;
	
	public static int roll(java.util.Random r)
	{
		return r.nextInt(1, 7) + r.nextInt(1, 7);
	}
	
	public void rollForIndeterminate(java.util.Random r, int result)
	{
		int total;
		
		while ((total = roll(r)) != result && total != 7)
			;
		
		win = total == result;
	}
	
	public void play()
	{
		java.util.Random r = new java.util.Random();				
		int total = roll(r);
		
		switch (total) {
		case 7, 11 -> win = true;
		case 2, 3, 12 -> win = false;
		default -> rollForIndeterminate(r, total);
		}
	}
}
