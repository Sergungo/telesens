package ua.sgolenko.telesense.tasks5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Corrector {

	public static void main(String[] args) {
		/*
		 * Ввести с клавиатуры строку. Удалить лишние пробелы, в том числе начальные и
		 * конечные. Внутри слов большие буквы заменить маленькими. Если перед словами,
		 * начинающимися с большой буквы, нет точки, добавить точку в конце
		 * предшествующих слов.
		 *
		 * Сформировать и вывести на экран слова, начинающиеся на мягкий знак.
		 */

		Scanner input = new Scanner(System.in);

		String line = input.nextLine();

		String withoutSpaces = line.trim();

		StringBuilder text = new StringBuilder();

		StringTokenizer st = new StringTokenizer(withoutSpaces);

		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			word = word.toUpperCase().charAt(0) + word.substring(1).toLowerCase();
			text = text.append(word + " ");
		}
		
		System.out.println(text);

		String[] words = text.toString().trim().split(" ");

		for (int i = 0; i < words.length; i++) {

			if (Character.isUpperCase(words[i].charAt(0)) && i != 0)
				if (!words[i - 1].endsWith("."))

					words[i - 1] += ".";
		}

		for (String word : words) {
			if (word.startsWith("�"))
				System.out.print(word + " ");
		}

	}

}
