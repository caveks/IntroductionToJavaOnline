package by.home.mod1.linear;

import java.util.Scanner;

//Вычислить значение выражения по формуле

public class LinearProg2 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double x;
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Введите a = ");
		a = s.nextDouble();
		System.out.print("Введите b = ");
		b = s.nextDouble();
		System.out.print("Введите c = ");
		c = s.nextDouble();
		
		x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * 3) + Math.pow(b, -2);
		System.out.println(x);

	}

}