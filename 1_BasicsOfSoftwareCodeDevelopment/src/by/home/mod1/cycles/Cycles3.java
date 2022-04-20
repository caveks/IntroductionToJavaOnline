package by.home.mod1.cycles;

//Найти сумму квадратов первых ста чисел

public class Cycles3 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int sum = 0;
		
		while (x <= 100){
			sum = x * x + sum;
			x++;
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна " + sum);
		
	}
	
}
