

/**
 * @author ir013043zb
 *
 */
public class Counter {

	public static int countA = 0;
	private static int countB = 0;

	Counter() {
		countA++;
		countB++;
	}

	public static int getCounterA() {
		return countA;
	}

	public static int getCounterB() {
		return countB;
	}

	public static boolean isEvenA() {
		if (countA % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEven(int _num) {
		if (_num % 2 == 0) {
			return true;
		}
		return false;
	}
}
