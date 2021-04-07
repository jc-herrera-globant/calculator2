package com.calculadora.program;

public class BasicOperations {

	public static void main(String[] args) {
		Suma suma = new Suma(4,5);
		System.out.println("La suma es: "+suma.sumarNumeros());
		
		Resta resta = new Resta(100,10);
		System.out.println("La resta es: "+resta.restarNumeros());
		

	}

}
