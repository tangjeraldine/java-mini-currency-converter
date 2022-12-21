package com.accenture.calculator;

import java.text.DecimalFormat;

public class GBP extends ConversionFormula {
	public double Rate=0.60d;
	public double Result;
	DecimalFormat df = new DecimalFormat("0.00");
	
	@Override
	public void calculate(double money) {
		Result = money*Rate;
		System.out.println("The current rate is 1 SGD to 0.60 Pound Sterling.");
		System.out.println("The British Pounds you will receive in return is "+df.format(Result));
	}
	
}
