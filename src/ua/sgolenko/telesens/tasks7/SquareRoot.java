package ua.sgolenko.telesens.tasks7;

public class SquareRoot {

	public static class SignCheckException extends Exception {

		private int input;

		public int getInput() {
			return input;
		}

		public SignCheckException(String message, int num) {
			super(message);
			input = num;
		}

	}

	public static double DoubleSquare(int a) throws SignCheckException {
		if (a < 0) {
			throw new SignCheckException("Input digit cannot be nagative", a);
		}
		return Math.sqrt(Math.sqrt(a));
	}

	public static void main(String[] args) {

		try {
			System.out.println(DoubleSquare(-4));
		} catch (SignCheckException e) {
			System.out.println("Your input is " + e.getInput() + ". Response: " + e.getMessage());
		}
	}

}
