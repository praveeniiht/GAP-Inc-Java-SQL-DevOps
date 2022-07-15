package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.function.Predicate;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq =new PriorityQueue();
		Predicate<Integer> p = x->x<10;
		pq.add(10);
		pq.add(20);
		pq.add(1);
		pq.add(9);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		
		ArrayDeque<Integer> dq = new ArrayDeque();
		dq.add(10);
		dq.add(4);
		dq.add(15);
		dq.add(2);
		System.out.println(dq);
		dq.removeIf(p);
		System.out.println(dq);

	}

}
