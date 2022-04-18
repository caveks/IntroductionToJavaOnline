package by.home.mod1.cycles;

//Найти сумму квадратов первых ста чисел

public class Cycles3 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 0;
		
		while (x <= 100){
			y = x * x + y;
			x++;
		}
		System.out.println(y);
		
	}
	
}
