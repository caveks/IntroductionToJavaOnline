package by.home.mod1.cycles;

import java.util.Scanner;

//Для каждого натурального числа от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры

public class Cycles7 {

	public static void main(String[] args) {

		int m, n, d;

		Scanner s = new Scanner(System.in);
		System.out.print("Введите натуральное число m = ");
		m = s.nextInt();
		while (m < 0) {
			System.out.println(m + " не является натуральным числом.");
			System.out.print("Введите натуральное число m = ");
			m = s.nextInt();
		}

		System.out.print("Введите натуральное число n = ");
		n = s.nextInt();
		while (n < 0) {
			System.out.println(n + " не является натуральным числом.");
			System.out.print("Введите натуральное число n = ");
			n = s.nextInt();
		}

		System.out.println("Все делители натуральных чисел от " + m + " до " + n + ":");

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ": ");
			d = 0;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					System.out.print(j + " ");
					d++;
				}
			}
			if (d == 0) {
				System.out.print("данное число не имеет делителей кроме единицы и самого числа");
			}
			System.out.println();
		}

		s.close();
	}

}
