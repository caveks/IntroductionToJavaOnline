package by.home.mod1.cycles;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Cycles8 {

	public static void main(String[] args) {
		
		int a = 5415823;
		int b = 6538934;
		String digitA = Integer.toString(a);
		String digitB = Integer.toString(b);
		
		System.out.println("Цифры входящие в запись первого числа:");
		for (int i = 0; i < digitA.length(); i++) {
			System.out.print(digitA.charAt(i) + " ");
		}
		
		System.out.println();
		
		System.out.println("Цифры входящие в запись второго числа:");
		for (int i = 0; i < digitB.length(); i++) {
			System.out.print(digitB.charAt(i) + " ");
		}
		
	}

}
