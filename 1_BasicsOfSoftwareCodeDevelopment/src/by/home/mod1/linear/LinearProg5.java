package by.home.mod1.linear;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class LinearProg5 {

	public static void main(String[] args) {
		
		int t;
		int hour;
		int min;
		int sec;
		
		t = 3661;
		hour = t / 3600;
		min = (t % 3600) / 60;
		sec = t % 60;
		
		System.out.println(hour + "ч " + min + "мин " + sec + "с");
		

	}

}
