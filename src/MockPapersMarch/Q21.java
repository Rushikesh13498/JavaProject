package MockPapersMarch;
import java.util.LinkedList;
import java.util.Queue;

public class Q21 {

	

	
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        // Adding 5 strings to the queue
	        queue.add("Virat");
	        queue.add("Sachin");
	        queue.add("Ajinkya");
	        queue.add("Kapil");
	        queue.add("Dhoni");

	        // 1. Adding 'Shikhar' to the queue
	        queue.add("Shikhar");

	        // Displaying the queue
	        System.out.println("Queue after adding 'Shikhar':");
	        System.out.println(queue);

	        // 2. Using peek method
	        String peekElement = queue.peek();
	        System.out.println("\nPeeked element: " + peekElement);

	        // 3. Using poll method
	        String pollElement = queue.poll();
	        System.out.println("\nPolled element: " + pollElement);
	        System.out.println("Queue after polling:");
	        System.out.println(queue);

	        // 4. Using offer method
	        queue.offer("Rohit");
	        System.out.println("\nQueue after offering 'Rohit':");
	        System.out.println(queue);
	    }
	}


//o/p-------->
//Queue after adding 'Shikhar':
//[Virat, Sachin, Ajinkya, Kapil, Dhoni, Shikhar]
//
//Peeked element: Virat
//
//Polled element: Virat
//Queue after polling:
//[Sachin, Ajinkya, Kapil, Dhoni, Shikhar]
//
//Queue after offering 'Rohit':
//[Sachin, Ajinkya, Kapil, Dhoni, Shikhar, Rohit]





