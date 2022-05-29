/*----------------------------------------------------------------------------------------------------------------------
    IntegerDecimalOccurence 
	String pattern matching in decimal representations of ints.
	
	Task description
	Two integers A and B are given. We are interested in positions at which decimal representation of A occurs as a substring 
	in the decimal respreesentation of B (counting from 0) For example:
	
		- 53 occurs in 1953786 at position 2.
		- 78 occurs in 1953786786 at positions 4 and 7
		- 57 does not occur in 153786.
	
	Decimal representations are assumed to be big-endian and without leading zeros (the only exception being the number 0, whose 
	decimal representation is "0")
	
	Write function
		
		class Solution { public int solution(int A, int B); }
	
	that, given two integers A and B, returns the leftmost position at which A occurs in B the function should return -1 
	if A does not occur in B. 
	For excample, given A = 53 and B = 1953786, the function should return 2, as explained above.
	Assume thet:
		
		- A and B are integers within the range [0..999,999,999].
		
	In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		ConcatWithHyphenApp.run();	
	}
}

class ConcatWithHyphenApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Yazıları girmeye başlayınız:");
		
		String str = "";		
		
		for (;;) {
			String s = kb.nextLine();
			
			if (s.trim().isEmpty())
				continue;			
			
			if ("elma".equals(s))				
				break;
			
			if (!str.isEmpty())				
				str += "-";
			
			str += s;
		}	
		
			
		System.out.println(str);
	}
}