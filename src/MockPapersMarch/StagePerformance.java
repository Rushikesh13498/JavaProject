package MockPapersMarch;

public class StagePerformance {

	
	    private int puneStudents = 2;
	    private int mumbaiStudents = 3;

	    public synchronized void performPuneStudent() {
	        while (puneStudents == 0) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Pune student performing...");
	        puneStudents--;
	        notifyAll();
	    }

	    public synchronized void performMumbaiStudent() {
	        while (mumbaiStudents == 0) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Mumbai student performing...");
	        mumbaiStudents--;
	        notifyAll();
	    }

	    public static void main(String[] args) {
	        StagePerformance stage = new StagePerformance();

	        Thread puneThread = new Thread(() -> {
	            for (int i = 0; i < 2; i++) {
	                stage.performPuneStudent();
	            }
	        });

	        Thread mumbaiThread = new Thread(() -> {
	            for (int i = 0; i < 3; i++) {
	                stage.performMumbaiStudent();
	            }
	        });

	        puneThread.start();
	        mumbaiThread.start();
	    }
	}

