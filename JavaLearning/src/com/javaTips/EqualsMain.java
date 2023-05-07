package com.javaTips;

import java.util.Objects;

class Client {
	int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}
}

public class EqualsMain {
	public static void main(String[] args) {
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);
		System.out.println("C1 == C2 --> " + c1.equals(c2));
		System.out.println("C2 == C3 --> " + c2.equals(c3));
		System.out.println(c1.hashCode());
	}
}
