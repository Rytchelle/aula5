package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.Conta_Corrente;
import entidade.Conta_Poupanca;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<Conta> lista = new ArrayList<>();
		
		System.out.println("Digite seu nome: ");
		String nome = scn.next();
		
		System.out.println("Digite seu numero: ");
		int numero = scn.nextInt();
		double saldo = scn.nextDouble();
		double limite = scn.nextDouble();
		
		System.out.println("Escolha:\n"
				+ "1- Conta Corrente\n" 
				+ "2- Conta poupança\n");
		int conta = scn.nextInt();
		
		if (conta == 1) {
			System.out.println("Qual o limite da conta: ");
			limite = scn.nextDouble();
			
			Conta c = new Conta_Corrente(nome, conta, saldo, limite);
			lista.add(c);
		} else {
			Conta d = new Conta_Poupanca(nome, conta, saldo);
			lista.add(d);
		}
		System.out.println(lista);
		
	}
	

		
		
		
		
		
		
		
		
		
		
		
	}


