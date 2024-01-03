package com.github.raulklahold.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		try {

		ColetarDados Conta = new ColetarDados();
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n Bem vindo ao Banco! ");

		System.out.print("\n\nPor favor, digite o seu nome completo:   ");
		String cliente = scanner.nextLine();
		Conta.setNomeCliente(cliente);

		System.out.print("\n\nPor favor, digite o número da sua conta:  ");
		int numero = scanner.nextInt();
		Conta.setNumeroConta(numero);

		System.out.print("\n\nPor favor, digite o número da sua Agência:  ");
		String agencia = scanner.next();
		Conta.setAgencia(agencia);

		System.out.print("\n\nPor favor, digite o seu saldo:   ");
		double saldo = scanner.nextDouble();
		Conta.setSaldo(saldo);

		scanner.close();

		String Nomecliente = Conta.getNomeCliente();
		int NumeroConta = Conta.getNumeroConta();
		String NumeroAgencia = Conta.getAgencia();
		double QtSaldo = Conta.getSaldo();
		
		System.out.print("\n Olá "+Nomecliente+", obrigado por criar uma conta em nosso banco!!");
		System.out.print("\n sua agência é: "+NumeroAgencia);
		System.out.print("\n o numero da sua conta é: "+NumeroConta);
		System.out.print("\n e o seu saldo é: "+QtSaldo);
		

    } catch (Exception e) {
        System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
    }
	}

}
