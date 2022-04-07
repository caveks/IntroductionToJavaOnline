package by.home.mod1.cycles;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class Cycles1 {

	public static void main(String[] args) {

		int x;
		int y = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Введите целое положительное число: ");
		x = s.nextInt();

		do {
			if (x == 0){
				System.out.println("Вы ввели \"0\", \"0\" - не является ни положительным, ни отрицательным числом!");
				System.out.print("Введите целое положительное число: ");
				x = s.nextInt();
			} else if (x < 0){
				System.out.println("Вы ввели отрицательное число!");
				System.out.print("Введите целое положительное число: ");
				x = s.nextInt();
			}
		} while (x < 0 || x == 0);

		for (int i = 0; i < x; i++) {
			y = y + i;
		}
		
		s.close();
		System.out.println("Сумма чисел от 1 до введенного Вами числа равна " + y);		

	}

}
