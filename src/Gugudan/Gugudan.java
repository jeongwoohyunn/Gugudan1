package Gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// for

		/*
		 * System.out.println("숫자를 입력하시오"); Scanner scanner = new Scanner(System.in);
		 * int input = scanner.nextInt(); if (input >= 2 && input <= 9) { for (int i =
		 * 1; i <= 9; i++) { int result = input * i; System.out.println(input + " * " +
		 * i + " = " + result); } } else
		 * System.out.println("2이상, 9이하의 값만 입력할 수 있습니다. 다시 입력해주세요."); input =
		 * scanner.nextInt(); if (input >= 2 && input <= 9) { for (int i = 1; i <= 9;
		 * i++) { int result = input * i; System.out.println(input + " * " + i + " = " +
		 * result); } }
		 */

		int input;
		while (true) {
			System.out.println("숫자를 입력하시오");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			if (input >= 2 && input <= 9)
				break;
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다. 다시 입력해주세요.");
		}
		for (int i = 1; i <= 9; i++) {
			int result = input * i;
			System.out.println(input + " * " + i + " = " + result);
		}

		// while
//	int i=1;
//	while(i<10) {
//		int result = input*i;
//		System.out.println(input+" * "+ i + " = " + result);
//		//i=i+1;
//		i+=1;	
//	}
	}
}
