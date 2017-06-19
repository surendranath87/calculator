package com.training.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String op = in.nextLine();
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(calculate(op, a, b));

	}
	
	public static int calculate(String op, int a, int b){
		
		switch(op){
		case "add" : return a + b;
		case "sub" : return a - b;
		case "mul" : return a * b;
		case "div" : return a / b;
		}
		return 0;
		
	}

}
