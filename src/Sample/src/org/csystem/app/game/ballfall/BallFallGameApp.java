package org.csystem.app.game.ballfall;

public class BallFallGameApp {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		BallFall bf = new BallFall();
		
		for (;;) {
			System.out.print("Width:");
			int width = Integer.parseInt(kb.nextLine());
			
			if (width == 0)
				break;
			
			System.out.print("Height:");
			int height =Integer.parseInt(kb.nextLine());
			
			
			bf.play(width, height);
			
			System.out.println(bf.getShape());
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}