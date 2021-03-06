package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		int cases = input.nextInt();
		while (cases != 0){
			String sentence = input.nextLine();
			ArrayList<String> wordArrayList = new ArrayList<String>();
			for(String word : sentence.split(" ")) {
			    wordArrayList.add(word);
			}
			System.out.print("Case #"+i+":");
			ListIterator<String> listiterator = wordArrayList.listIterator(wordArrayList.size());
			while(listiterator.hasPrevious()){
				System.out.print(listiterator.previous()+" ");
			}
			i++;
			cases--;
		}
		
	}

}
