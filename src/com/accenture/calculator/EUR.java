package com.accenture.calculator;

import java.text.DecimalFormat;

public class EUR extends ConversionFormula {
	public double Rate=0.70d;
	public double Result;
	DecimalFormat df = new DecimalFormat("0.00");
	
	@Override
	public void calculate(double money) {
		Result = money*Rate;
		System.out.println("The current rate is 1 SGD to 0.70 Euros.");
		System.out.println("The Euros you will receive in return is "+df.format(Result));
	}
	
}
