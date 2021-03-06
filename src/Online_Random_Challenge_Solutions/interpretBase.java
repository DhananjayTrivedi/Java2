package programs;

import java.util.Scanner;

public class interpretBase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int base = input.nextInt();
		System.out.println(findValue(s,base));;
	}

	private static int findValue(String s, int base) {
		StringBuilder rev = new StringBuilder(s);
		String string = rev.reverse().toString();
		int value = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '1'){
				value += Math.pow(base, i);
			}
		}
		return value;
	}

}
