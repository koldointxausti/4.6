

/**
 * @author ir013043zb
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();

		System.out.println("public static int countA: " + Counter.countA);
		System.out.println("public int getCounterA: " + a.getCounterA());
		System.out.println("public int getCounterA: " + Counter.getCounterA());

		System.out.println("private static int countB: " + Counter.getCounterB());
		System.out.println("public int getCounterB: " + b.getCounterB());
		System.out.println("public int getCounterB: " + Counter.getCounterB());

		System.out.println("Bikoitia al da A? " + Counter.isEvenA());
		System.out.println("Bikoitia al da (_num=3)? " + Counter.isEven(3));
		System.out.println("Bikoitia al da (_num=4)? " + Counter.isEven(4));
	}

}