package com.github.raulklahold.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		ColetarDados Conta = new ColetarDados();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Bem vindo ao Banco! ");
		
		System.out.print("\n\nPor favor, digite o número da sua conta:  ");
        int numero = scanner.nextInt();
		Conta.setNumeroConta(numero);
		
		System.out.print("\n\nPor favor, digite o número da sua Agência:  ");
        String agencia = scanner.next();
		Conta.setAgencia(agencia);
		
		System.out.print("\n\nPor favor, digite o seu nome completo:   ");
        String cliente = scanner.next();
		Conta.setNomeCliente(cliente);
		
		
		
		scanner.close();
		
		
		

	}

}
