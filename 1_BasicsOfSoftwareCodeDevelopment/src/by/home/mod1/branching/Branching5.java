package by.home.mod1.branching;

import java.util.Scanner;

//Вычислить значение функции:

public class Branching5 {

	public static void main(String[] args) {
		
		double x;
		double y;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Введите х: ");
		x = s.nextDouble();
		
		if (x <= 3) {
			y = x * x - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println("Значение функции = " + y);

	}

}
