import java.util.Scanner;

public class StringExampless {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println("Adding Random Charecters...");
		int range = (int) (Math.random()*15);
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		for (int i = 0; i < (int)(Math.random()*sb.length()); i++) {
			char temp = (char) (Math.random()*64);
			sb.insert((int)(Math.random()*s.length()),temp);
		}
		System.out.println(sb);
		
		int count = 0;
		for(int i=0;i<sb.length();i++)
		{
		    char c = sb.charAt(i);
		    if(c > 122 || c < 65)
		    {
		    	count+=1;
		    }
		}
		System.out.println(count);
	}
}
