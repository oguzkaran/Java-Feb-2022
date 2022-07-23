package org.csystem.app.simulation.craps;

public class CrapsSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		for (;;) {
			
			System.out.print("Kaç kez oynamak istersiniz?");
			int n = kb.nextInt();
			
			if (n <= 0)
				break;
			
			System.out.println("-----------------------------------------");
			CrapsSimulation cs = new CrapsSimulation();
			
			cs.run(n);
			System.out.printf("Kazanma olasılığı:%f%n", cs.getProbability());
			System.out.println("-----------------------------------------");
		}		
	}
}