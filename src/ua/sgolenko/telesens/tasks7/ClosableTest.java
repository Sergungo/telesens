package ua.sgolenko.telesens.tasks7;

import java.util.Scanner;

public class ClosableTest {

	public static void main(String[] args) {

		try (ArrayCreator finder = new ArrayCreator()) {

			double x;
			while (true) {
				Scanner scanner = new Scanner(System.in);
				x = scanner.nextDouble();
				finder.add(x);
				
			}
		} catch (Exception ex) {
			System.out.println();
			System.out.println(ex.toString());
		}
	}
}