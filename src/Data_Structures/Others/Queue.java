package Java.Data_Structures.Others;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		java.util.Queue<String> queue = new LinkedList<>();
		queue.offer("Hello");
		queue.offer("StackOverFlow");
		queue.offer("User");
		
		System.out.println(queue.peek());
		
		while (queue.size() > 0){
			System.out.println(queue.remove() + " ");
		}
		//Since Queue is empty now so this will return NULL
		System.out.println(queue.peek());
		
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.offer("Oklahoma");
		queue1.offer("Indiana");
		queue1.offer("Georgia");
		queue1.offer("Texas");
		System.out.println("Priority queue using Comparable:");
		while (queue1.size() > 0) {
			System.out.print(queue1.remove() + " ");
		}
		PriorityQueue<String> queue2 = new PriorityQueue(4, Collections.reverseOrder());
		queue2.offer("Oklahoma");
		queue2.offer("Indiana");
		queue2.offer("Georgia");
		queue2.offer("Texas");
		System.out.println("\nPriority queue using Comparator:");
		while (queue2.size() > 0) {
			System.out.print(queue2.remove() + " ");
		} 
		
		PriorityQueue<Integer> queue3 = new PriorityQueue<>();
		queue3.offer(1);
		queue3.offer(2);
		queue3.offer(3);
		queue3.offer(4);
		queue3.offer(5);
		while (queue3.size() > 0) {
			System.out.print(queue3.remove() + " ");
		}
		
	}

}
