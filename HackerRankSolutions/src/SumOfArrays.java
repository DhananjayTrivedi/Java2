import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
