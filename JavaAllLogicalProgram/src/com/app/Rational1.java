package com.app;

import java.io.IOException;
import java.util.Scanner;

class Rational {

	public long gcd(long a, long b) {

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}

public class Rational1 {
	public static void main(String args[]) throws IOException {
		Rational r = new Rational();

		long a, b, x, y;
		String str;
		Scanner in=new Scanner(System.in);
		//DataInputStream in = new DataInputStream(System.in);
		System.out.println("Enter the value1");
		str = in.nextLine();
		a = Integer.parseInt(str);
		System.out.println("Enter the value2");
		str = in.nextLine();
		b = Integer.parseInt(str);

		long l = r.gcd(a, b);
		System.out.println();
		System.out.println("GCD of the numbers: " + l);

		x = a / l;
		y = b / l;
		System.out.println();
		System.out.println("Rational number:  " + x + "/" + y);
	}

}