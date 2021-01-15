package by.home.mod1.branching;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class Branching4 {

	public static void main(String[] args) {
		
		int a = 25;
		int b = 10;
		int x = 8;
		int y = 21;
		int z = 30;
		
		if((a >= x && (b >= y || b >= z)) || (a >= y && (b >= x || b >= z)) || (a >= z && (b >= x || b>= y))){
			System.out.println("Данный кирпич пройдёт через отверстие");
		} else { 	
			System.out.println("Данный кирпич не пройдёт через отверстие");
		}	

	}

}
