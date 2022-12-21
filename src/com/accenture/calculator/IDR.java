package com.accenture.calculator;

import java.text.DecimalFormat;

public class IDR extends ConversionFormula {
	public double Rate=11542.65d;
	public double Result;
	DecimalFormat df = new DecimalFormat("0.00");
	
	@Override
	public void calculate(double money) {
		Result = money*Rate;
		System.out.println("The current rate is 1 SGD to 11,542.65 Indonesian Rupiahs.");
		System.out.println("The Rupiahs you will receive in return is "+df.format(Result));
	}
	
}
