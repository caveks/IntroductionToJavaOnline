package by.home.mod1.branching;

import java.util.Scanner;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. 

public class Branching3 {

	public static void main(String[] args) {
		
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Введите координаты точки А: ");
		System.out.print("x1 = ");
		x1 = s.nextInt();
		System.out.print("y1 = ");
		y1 = s.nextInt();
		System.out.println("Введите координаты точки В: ");
		System.out.print("x2 = ");
		x2 = s.nextInt();
		System.out.print("y2 = ");
		y2 = s.nextInt();
		System.out.println("Введите координаты точки С: ");
		System.out.print("x3 = ");
		x3 = s.nextInt();
		System.out.print("y3 = ");
		y3 = s.nextInt();
		
		if((x3 - x1)/(x2 - x1) == (y3 - y1)/(y2 - y1)) {
			System.out.println("Точки A, B, C расположены на одной прямой");
		} else {
			System.out.println("Точки A, B, C не расположены на одной прямой");
		}		

	}

}
