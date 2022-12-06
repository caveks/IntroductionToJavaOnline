package by.home.mod2.array;

//В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K. 

public class Array1 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int k = 3;
		int s = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0 ){
				s = s + a[i];
			}
		}
		
		if (s != 0) {
			System.out.println("Сумма элементов массива которые кратны данному числу " + k + ": " + s);
		} else {
			System.out.println("В массиве нет элементов которые кратны данному числу " + k);
		}
			
	}

}
