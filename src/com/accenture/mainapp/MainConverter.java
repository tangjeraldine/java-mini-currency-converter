package com.accenture.mainapp;

import java.util.Scanner;

import com.accenture.SGDinput.InputApp;
import com.accenture.calculator.*;

interface Rep {
	String Cycle();
	void Repeat();
}

class Rep2 implements Rep {
	
	InputApp ia = new InputApp();
	double SingDollar;
	int Currency;
	
	public String Cycle() {
		System.out.println("Would you like to calculate again? (y/n)");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}

	@Override
	public void Repeat() {
		ia.setSingDollar();
		ia.setCurrency();
		SingDollar = ia.getSingDollar();
		Currency = ia.getCurrency();		
	}
}

public class MainConverter {

	public static void main(String[] args) {
		double SingDollar;
		int Currency;
		String ans="";
		
		InputApp ia = new InputApp();
		EUR e = new EUR();
		GBP g = new GBP();
		HKD h = new HKD();
		IDR i = new IDR();
		MYR m = new MYR();
		Rep2 rep = new Rep2();
		
		ConversionFormula ref;
		
		ia.setSingDollar();
		ia.setCurrency();
		SingDollar = ia.getSingDollar();
		Currency = ia.getCurrency();
//		System.out.println(ia.Country);
		
		switch (Currency) {
		case 1: ref = m;
		m.calculate(SingDollar);
		ans = rep.Cycle();
		if (ans.equals("y")) {
			rep.Repeat();
			m.calculate(SingDollar);
			rep.Cycle();
		}
		break;
		case 2: ref = h;
		h.calculate(SingDollar);
		ans = rep.Cycle();
		if (ans.equals("y")) {
			rep.Repeat();
			h.calculate(SingDollar);
			rep.Cycle();
		}
		break;
		case 3: ref = i;
		i.calculate(SingDollar);
		ans = rep.Cycle();
		if (ans.equals("y")) {
			rep.Repeat();
			i.calculate(SingDollar);
			rep.Cycle();
		}
		break;
		case 4: ref = g;
		g.calculate(SingDollar);
		ans = rep.Cycle();
		if (ans.equals("y")) {
			rep.Repeat();
			g.calculate(SingDollar);
			rep.Cycle();
		}
		break;
		case 5: ref = e;
		e.calculate(SingDollar);
		ans = rep.Cycle();
		if (ans.equals("y")) {
			rep.Repeat();
			e.calculate(SingDollar);
			rep.Cycle();
		}
		break;
		}

	}

}
