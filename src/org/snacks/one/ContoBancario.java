package org.snacks.one;

import java.util.Scanner;

public class ContoBancario {

	private int numeroConto;
	private double saldo;
	
	public ContoBancario(int numeroConto) {
		this.saldo = 0;
		this.numeroConto = numeroConto;
	}
	public int getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double preleva(double importo) {
		 this.saldo -= importo;
		 return saldo;
	}
	public double versa(double importo) {
		 this.saldo += importo;
		 return saldo;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ContoBancario mioConto = new ContoBancario(120356);
		
		System.out.println("saldo attuale: " + mioConto.getSaldo());
		System.out.println("inserisci importo da prelevare");
		mioConto.preleva(input.nextDouble());
		System.out.println("saldo attuale: " + mioConto.getSaldo());
		System.out.println("inserisci importo da versare");
		mioConto.versa(input.nextDouble());
		System.out.println("saldo attuale: " + mioConto.getSaldo());

	}



}
