package by.home.mod1.cycles;

//Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен заданному e.

public class Cycles5 {

	public static void main(String[] args) {

		double e = 0.1;
		double x;
		double sum = 0;

		for (int i = -5; i <= 5; i++) {
			x = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);			
				if (Math.abs(x) >= e) {
					sum = sum + x;
				}
		}

		System.out.println("Сумма членов ряда, модуль которых больше или равен числу e = " + e + " равна " + sum);
	}

}
