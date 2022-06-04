/*----------------------------------------------------------------------------------------------------------------------	 
	Homework-002-4. sorunun bir çözümü
	(Not: İleride daha iyisi yazılacaktır) 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		BallFallGameApp.run();
	}
}

class BallFallGameApp {	
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
			int height = Integer.parseInt(kb.nextLine());
			
			
			bf.play(width, height);
			
			System.out.println(bf.shape);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class BallFall {
	public String shape;	
	
	public static boolean updateRightFlag(boolean isRight, int ballIndex, int width)
	{
		if (ballIndex == 0)
			isRight = true;
		else if (ballIndex == width - 1)
			isRight = false;
		
		return isRight;		
	}
	
	public static int updateBallIndex(boolean isRight, int ballIndex)
	{
		if (isRight)
			return ballIndex + 1;
		
		return ballIndex - 1;
	}
	
	public void fillSpace(int begin, int end) //[begin, end)
	{
		for (int i = begin; i < end; ++i)
			shape += ' ';
	}
	
	public void fillBall(int ballIndex, int end)
	{
		fillSpace(0, ballIndex);
		shape += '*';
		fillSpace(ballIndex + 1, end);
	}	
	
	
	public BallFall()
	{
		shape = "";
	}
	
	
	public void play(int width, int height)
	{
		int ballIndex = 0;
		boolean isRight = false;
		
		shape = "";
		
		for (int i = 1; i <= height; ++i) {
			shape += '|';
			fillBall(ballIndex, width);
			if (width != 1) {
				isRight = updateRightFlag(isRight, ballIndex, width);
				ballIndex = updateBallIndex(isRight, ballIndex);
			}
			shape += "|\r\n";
		}		
	}
}
