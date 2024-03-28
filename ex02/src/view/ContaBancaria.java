package view;

public class ContaBancaria {
	public int numeroConta;
	public String nome;
	public double saldo;
	
	
	public ContaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo= 0;
	}
	
	
	public double deposito(int quantia) {
		this.saldo = saldo + quantia;
		return saldo ;	
	}
	public double saque(int quantia) {
		this.saldo = saldo - quantia;
		return saldo;	
	}

}
