package by.home.mod1.linear;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае

public class LinearProg6 {

	public static void main(String[] args) {
		
		int x;
		int y;
		boolean answer;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Введите координаты точки (x, y):");
		System.out.print("x = ");
		x = s.nextInt();
		System.out.print("y = ");
		y = s.nextInt();
		s.close();
		
		answer = ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) | ((x >= -4 && x <= 4) && (y >= -3 && y <= 0));
		
		System.out.println(answer);
		
	}

}
