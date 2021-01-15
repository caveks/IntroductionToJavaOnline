package by.home.mod1.branching;

// Найти max{min(a, b), min(c, d)}

public class Branching2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int minX;
		int minY;
		
		a = 5;
		b = 5;
		c = 3;
		d = 8;
		
		if (a < b) {
			minX = a;
		} else {
			minX = b;
		}
		
		if (c < d) {
			minY = c;
		} else {
			minY = d;
		}
		
		if (minX > minY) {
			System.out.println(minX);
		} else {
			System.out.println(minY);
		}
		
	}

}
