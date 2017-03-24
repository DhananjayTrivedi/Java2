import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		for (int i = 0; i < size; i++) {
			int d = size - i;
			while(d>1){
				System.out.print(" ");
				d--;
			}
			for(int j = 0;j<=i;j++)
				System.out.print("#");
			System.out.println();
		}
	}

}
