package programs;

import java.util.Scanner;

public class NumbersJam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int i = 1;
		while(cases!=0){
			int n = input.nextInt();
			int ans =(int) Math.pow((3 + Math.sqrt(5)), n);
			String s = String.valueOf(ans);
			char tens;
			char hund;
			char ones;
			try{
				ones = s.charAt(s.length()-1);
			}
			catch(Exception e){
				ones = '0';
			}
			try{
				tens = s.charAt(s.length() - 2);
			}
			catch(Exception e){
				tens = '0';
			}
			try{
				hund = s.charAt(s.length() - 3);
			}
			catch(Exception e){
				hund = '0';
			}
			System.out.println("Case #"+i+" "+hund+""+tens+""+ones);

			i++;
			cases --;
		}
	}

}
