package com.calculator.logic;

public class Division implements ICalculator{

	@Override
	public double performOperation(int numb1, int numb2) {
		if(numb2 == 0) {
			 throw new IllegalArgumentException("Number can not be devided by 0");
		}
		else {
		return (numb1/numb2);
		}
	}

}
