package by.home.mod1.cycles;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел

public class Cycles4 {

	public static void main(String[] args) {

		BigInteger x = BigInteger.valueOf(1);

		for (long i = 2; i <= 200; i++) {
			x = x.multiply(BigInteger.valueOf(i * i));
		}

		System.out.println("Произведение квадратов первых двухсот чисел равно " + x);

	}

}
