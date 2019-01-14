package ua.sgolenko.telesens.tasks5;

import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {

		/*
		 * Ввести с клавиатуры строку программного кода. Проверить соответствие фигурных
		 * скобок. Заменить открывающиеся фигурные скобки словом begin, а закрывающиеся
		 * – словом end. Использовать класс StringBuilder.
		 */

		String line = new Scanner(System.in).nextLine();

		char[] letters = line.toCharArray();
		int count = 0;

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == '{')
				count++;
			if (letters[i] == '}')
				count--;
			if (count < 0) {
				System.out.println("Missing opening braces");
				return;
			}
		}

		if (count > 0) {
			System.out.println("Missing closing braces");
			return;
		}
		String checked = new String(letters);

		checked = checked.replace("{", "begin ");
		checked = checked.replace("}", " end ");

		System.out.println(checked + "");
	}
}
