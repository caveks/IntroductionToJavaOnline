package by.home.mod1.cycles;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.


public class Cycles1 {

	public static void main(String[] args) {
		
		int x;
		int y = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Введите целое положительное число: ");
		x = s.nextInt();
		
		if (x > 0) {
			for (int i = 2; i < x; i++) {
				y = y + i;
			}
		} else {
			System.out.print("Вы ввели отрицательное число! Введите целое положительное число: ");
			x = s.nextInt();
			for (int i = 2; i < x; i++) {
				y = y + i;
			}
		}
		s.close();
		
		System.out.println("Сумма чисел от 1 до введенного Вами числа равна " + y);		

	}

}
