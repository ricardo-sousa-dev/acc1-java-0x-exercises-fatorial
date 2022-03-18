package com.trybe.acc.java;

public class Fatorial {
  /**
   * Método inicial.
   *
   */
	public static void main(String[] args) {

		long fatorial18 = 1;

		for (int i = 1; i <= 18; i++) {
			fatorial18 *= i;
		}

		System.out.println("O fatorial de 18 é igual a " + fatorial18);
	}
}
