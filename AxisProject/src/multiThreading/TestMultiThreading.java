package multiThreading;

public class TestMultiThreading {
	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
	}
}
