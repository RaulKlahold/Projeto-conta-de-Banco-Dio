package com.github.raulklahold.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		ColetarDados Conta = new ColetarDados();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso em kg: ");
        int numero = scanner.nextInt();
		Conta.setNumeroConta(numero);
		

	}

}
