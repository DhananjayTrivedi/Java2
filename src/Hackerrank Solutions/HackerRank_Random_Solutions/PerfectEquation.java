import java.util.Scanner;

public class PerfectEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		while(testCases != 0){
			int A = input.nextInt();
			int B = input.nextInt();
			long x = B, y = A;
			System.out.println(asFraction(x, y));
		}		
	}
	
	public static long gcm(long a, long b) {
	    return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
	}

	public static String asFraction(long a, long b) {
	    long gcm = gcm(a, b);
	    return (a / gcm) + " " + (b / gcm);
	}
}
