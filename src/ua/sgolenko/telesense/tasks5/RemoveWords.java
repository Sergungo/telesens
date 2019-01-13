package ua.sgolenko.telesense.tasks5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RemoveWords {

	public static void main(String[] args) {
		/*
		 * Ввести с клавиатуры строку из нескольких слов, а также некоторую
		 * последовательность символов. Удалить из строки слова, содержащие введенную
		 * последовательность символов в виде подстроки.
		 */

		Scanner input = new Scanner(System.in);

		String line = input.nextLine();
		String symbols = input.nextLine();

		StringTokenizer st = new StringTokenizer(line);

		StringBuilder var = new StringBuilder(line);

		while (st.hasMoreTokens()) {

			String word = st.nextToken();
			if (word.contains(symbols)) {
				int start = var.indexOf(word);
				var.delete(start, start + word.length());
			}

		}

		System.out.println(var + "");

	}

}
