package org.snacks.one;

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
	
	
	public static void main(String[] args) {
		

	}








}
