package com.accenture.calculator;

import java.text.DecimalFormat;

public class HKD extends ConversionFormula {
	public double Rate=5.77d;
	public double Result;
	DecimalFormat df = new DecimalFormat("0.00");

	@Override
	public void calculate(double money) {
		Result = money*Rate;
		System.out.println("The current rate is 1 SGD to 5.77 HKD.");
		System.out.println("The HKD you will receive in return is "+df.format(Result));
	}
	
}
