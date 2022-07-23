package org.csystem.app.simulation.craps;

import org.csystem.app.game.craps.Craps;

public class CrapsSimulation {
	private double m_p;

	public double getProbability()
	{
		return m_p;
	}
	
	public void run(int n)
	{		
		int winCount = 0;
		
		for (int i = 0; i < n; ++i) {
			Craps craps = new Craps();
			
			craps.play();
			
			if (craps.win)
				++winCount;
		}
		
		m_p = (double)winCount / n;
	}


}