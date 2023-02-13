package com.calculator.logic;

import java.util.Scanner;

public class PerformCalculation {

	public static void main(String[] args) {
		
		
        Scanner inputScanner = new Scanner(System.in);				
		String operator = "";
		int numb1 = 0, numb2 = 0;
		CalculatorMethod1 calObjMethod1;
		ICalculator calObjMethod2;
		
		first:
		while(operator != "exit") {	
		System.out.println("Enter the operator + OR - OR * OR / and type 'exit' to quite the execution");
		operator = inputScanner.next();
		if(operator == "exit") {
			break first;
		}
		
		if(operator != "exit") {
			System.out.println("Enter number 1");
			numb1 = inputScanner.nextInt();
			System.out.println("Enter number 2");
			numb2 = inputScanner.nextInt();		
		}
		calObjMethod1=new CalculatorMethod1();
		switch (operator) {
	
		case "+": {
			System.out.println("Result from Method1: Addition of two number is " + calObjMethod1.Add(numb1, numb2));
			calObjMethod2 = new Addition();
			System.out.println("Result from Method2: Addition of two number is  " + calObjMethod2.performOperation(numb1, numb2));
			
			break;
		}
		case "-": {
			System.out.println("Result from Method1: Subtraction of two number is " + calObjMethod1.Sub(numb1, numb2));
			calObjMethod2 = new Subtraction();
			System.out.println("Result from Method2: Subtraction of two number is " + calObjMethod2.performOperation(numb1, numb2));
			break;
		}
		case "*": {
			System.out.println("Result from Method1: Multiplication of two number is " + calObjMethod1.Mul(numb1, numb2));
			calObjMethod2 = new Multiplication();
			System.out.println("Result from Method2: Multiplication of two number is " + calObjMethod2.performOperation(numb1, numb2));
			break;
		}
		case "/": {			
			System.out.println("Result from Method1: Division of two number is " + calObjMethod1.Div(numb1, numb2));
			calObjMethod2 = new Division();
			System.out.println("Result from Method2: Division of two number is " + calObjMethod2.performOperation(numb1, numb2));
			break;
		}	
		case "exit": {			
			break first;
		}	
		default:{
			System.out.println("Please enter valid operator");
			break;
		}
		}
			
	}		
		System.out.println("you pressed " + operator);	
			
	}
}
