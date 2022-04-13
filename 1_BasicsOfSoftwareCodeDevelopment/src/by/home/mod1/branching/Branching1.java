package by.home.mod1.branching;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Branching1 {

	public static void main(String[] args) {

		int a;
		int b;
		a = 20;
		b = 70;

		if (a + b < 180) {
			System.out.print("Такой треугольник существует! ");
			if (a == 90 || b == 90 || a + b == 90) {
				System.out.println("Он прямоугольный!");
			}
		} else {
			System.out.println("Такого треугольника не существует!");
		}
	}
	
}
