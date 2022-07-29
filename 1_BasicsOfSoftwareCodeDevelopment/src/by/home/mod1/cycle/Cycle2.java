package by.home.mod1.cycle;

import java.util.Scanner;

//Вычислить значения функции на отрезке [a,b] с шагом h

public class Cycle2 {

	public static void main(String[] args) {

		int a, b, h;
		int x, y;

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Введите значения отрезка [a,b] и шаг h:");
		System.out.print("Введите значение переменной a = ");
		a = s.nextInt();
		System.out.print("Введите значение переменной b = ");
		b = s.nextInt();
		System.out.print("Введите шаг h = ");
		h = s.nextInt();		

		System.out.println("Значения функции на отрезке [" + a + "," + b + "] с шагом " + h);
		for(x = a; x <= b; x = x + h)  {
			if (x > 2) {
				y = x;
				System.out.println("y = " + y);
			} else if (x <= 2){
				y = -x;
				System.out.println("y = " + y);
			}	
		}

	}

}
