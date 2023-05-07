package com.exception;

class Currency {
	private String Currency;
	private int amount;

	public Currency(String currency, int amount) {
		super();
		Currency = currency;
		this.amount = amount;
	}

	public void add(Currency that) {
		if (!this.Currency.equals(that.Currency)) {
			throw new CurrenciesDoNotMatchException("Currencies don't match " + this.Currency + " & " + that.Currency);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "Currency [Currency=" + Currency + ", amount=" + amount + "]";
	}
}

@SuppressWarnings("serial")
class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class CustomExceptionMain {
	public static void main(String[] args) {
		Currency curr1 = new Currency("USD", 30);
		Currency curr2 = new Currency("INR", 50);
		curr1.add(curr2);
		System.out.println(curr1);
	}

}
