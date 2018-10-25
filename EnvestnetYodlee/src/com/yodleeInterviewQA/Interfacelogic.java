package com.yodleeInterviewQA;

public class Interfacelogic implements Interfaceintvarlogic {

	public static void main(String[] args) {
		Interfacelogic logic = new Interfacelogic();
		logic.method();
		// System.out.println(Interfaceintvarlogic.i);
		System.out.println(Interfaceintvarlogic.j);
	}

	@Override
	public void method() {
		System.out.println("implementation");
	}

}
