package binaryIO;

import java.util.Scanner;

public class Beehive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		while(cases!=0){
			int t = input.nextInt();
			int P = (int)(Math.ceil(100 * Math.sqrt(t) + 201/(t+1) + 1));
			System.out.println(t+" "+P);
		}
	}

}
