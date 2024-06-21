package functions;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				
					System.out.println("Task is running ");
				
			}
		};
//			@Override
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println("loop - "+Thread.currentThread().getId());
//				}
//			}
//		};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r2 = () -> System.out.println("Task is running..");
		Thread t2 = new Thread(r2);
		t2.start();
		
		Runnable r1 = () -> {for(int i=0;i<10;i++) {System.out.println("loop - "+Thread.currentThread().getId());}};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
