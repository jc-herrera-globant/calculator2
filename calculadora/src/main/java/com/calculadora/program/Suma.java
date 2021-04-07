package com.calculadora.program;

public class Suma {
	private int num1;
	private int num2;
	
	public Suma(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int sumarNumeros() {
		return this.num1+this.num2;
	}

}
