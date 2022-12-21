package com.accenture.calculator;

import java.text.DecimalFormat;

public class MYR extends ConversionFormula {
	public double Rate=3.25d;
	public double Result;
	DecimalFormat df = new DecimalFormat("0.00");
	
	@Override
	public void calculate(double money) {
		Result = money*Rate;
		System.out.println("The current rate is 1 SGD to 3.25 MYR.");
		System.out.println("The MYR you will receive in return is "+df.format(Result));
	}
	
}
