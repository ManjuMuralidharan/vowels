import java.util.*;

class revvowel
{
	public static void main(String[] args)
	{
		String s="ReverseMe";
		char c;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
			
			}
			else
			{
				sb.append(c);
			}
		}
		String s1=sb.toString();
		StringBuffer sb1=new StringBuffer(s1);
		sb1.reverse();
		System.out.println(sb1);
		
	}
}