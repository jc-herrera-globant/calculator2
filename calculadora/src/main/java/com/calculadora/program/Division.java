package com.calculadora.program;

public class Division {
	private int num1;
	private int num2;
	
	public Division (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int dividirNumeros() {
		return num1/num2;
	}
}
