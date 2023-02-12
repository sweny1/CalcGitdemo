package com.calculator.logic;

public class CalculatorMethod1 {
	 
	 public float Add(int number1,int number2) {
		 return (number1+ number2);
	 }
	 
	 public float Sub(int number1,int number2) {
		 return (number1- number2);
	 }
	 
	 public float Mul(int number1,int number2) {
		 return (number1* number2);
	 }
	 
	 public double Div(int number1,int number2) {
		 if(number2 == 0)
		  throw new IllegalArgumentException("Number can not be devided by 0");
		 else 
			 return (number1/ number2);
	 }
	
}
