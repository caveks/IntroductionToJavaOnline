package by.home.mod1.cycle;

//Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера

public class Cycles6 {
	
	public static void main(String[] args) {
		
		System.out.println("Соответствие между символами и их численными обозначениями(таблица символов ASCII)");
		
		for (int i = 33; i <= 255; i++) {
			System.out.println((char)i + " -> " + i);
		}
	}

}
