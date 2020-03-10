package testDay1;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pld = "Madam";
		String tl ="";
		
		for (int i=pld.length()-1; i>=0; i--)
		{
			tl=tl+pld.charAt(i);
			
		}
		System.out.println(tl);
		
		if (pld.contentEquals(tl))
				{
			
			System.out.println("its Palindrome");
			
				}

		else System.out.println("its not Palindrome");
	}

}
