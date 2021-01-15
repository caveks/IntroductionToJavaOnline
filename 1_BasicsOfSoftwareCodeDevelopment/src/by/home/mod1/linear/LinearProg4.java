package by.home.mod1.linear;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
//дробную и целую части числа и вывести полученное значение числа.

public class LinearProg4 {

	public static void main(String[] args) {
		
		double r;
		int x;
		int y;
		
		r = 987.123;
		x = (int) r;
		y = (int)(r * 1000) % 1000; 		
		System.out.println(y + "." + x);
			
  	}

}
