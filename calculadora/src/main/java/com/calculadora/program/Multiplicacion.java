package com.calculadora.program;

public class Multiplicacion {
	private int num1;
	private int num2;
	
	public Multiplicacion(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int multiplicarNumeros() {
		return this.num1*this.num2;
	}
}
