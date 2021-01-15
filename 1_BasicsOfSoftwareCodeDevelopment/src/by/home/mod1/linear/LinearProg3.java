package by.home.mod1.linear;

import java.util.Scanner;

//Вычислить значение выражения по формуле

public class LinearProg3 {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Введите x = ");
		x = s.nextDouble();
		System.out.print("Введите y = ");
		y = s.nextDouble();
		s.close();
		
		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		System.out.println(z);

	}

}
