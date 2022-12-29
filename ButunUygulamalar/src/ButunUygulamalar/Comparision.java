package ButunUygulamalar;

import java.util.Scanner;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Enter first number : ");
		num1 = input.nextInt();
		
		System.out.printf("Enter second number : ");
		num2 = input.nextInt();
		
		if(num1 == num2)
			System.out.printf("%d == %d%n", num1, num2);
		if(num1 != num2)
			System.out.printf("%d != %d%n", num1,num2);
		if(num1 < num2)
			System.out.printf("%d < %d%n", num1,num2);
		if(num1 > num2)
			System.out.printf("%d > %d%n", num1,num2);
		if(num1 <= num2)
			System.out.printf("%d <= %d%n", num1,num2);
		if(num1 >= num2)
			System.out.printf("%d >= %d%n", num1,num2);
		
		
		

	}

}
