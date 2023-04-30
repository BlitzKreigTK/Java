package com.basic;

import java.math.BigDecimal;

public class SimpleIntrestCal {

	BigDecimal principal;
	BigDecimal intrest;

	SimpleIntrestCal(String principal, String intrest) {
		this.principal = new BigDecimal(principal);
		this.intrest = new BigDecimal(intrest).divide(new BigDecimal(100));
	}

	public BigDecimal CalcTotalVal(int years) {
		// SI = PI + (PI * (Interest/100) * Years);
		BigDecimal noOfYears = new BigDecimal(years);
		BigDecimal totalSum = principal.add(principal.multiply(intrest).multiply(noOfYears));
		return totalSum;
	}
}
