package com.basic;

import java.math.BigDecimal;

public class SimpleIntrestCalMain {

	public static void main(String[] args) {
		SimpleIntrestCal si = new SimpleIntrestCal("4500.00", "7.5"); // PI and Interest
		BigDecimal totalValue = si.CalcTotalVal(5);
		System.out.println(totalValue);
	}

}
