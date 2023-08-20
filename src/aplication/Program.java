package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;
/*
 * programa criado com o intuito de Mostra uma agencia bancaria, como a criação de uma conta no banco.
 * 
 * Autor: Iury Macedo
 * */
public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //entrada de dados.
		
		System.out.println("Bem Vindo! ao Banco da DIO");
		System.out.println("Insira seus Dados Abaixo");
		System.out.print("Nome: ");
		String nome = sc.nextLine(); //recebe o nome do cliente. 
		System.out.print("Numero da Conta: ");
		int numConta = sc.nextInt(); 
		sc.nextLine(); // utlizado para limpara a linha extra que recebe entre integer e uma varivel string. ficando um espaço vazio.
		System.out.print("Agencia: ");
		String agencia = sc.nextLine();
		System.out.print("Saldo da Conta: ");
		double saldoConta = sc.nextDouble();
		
		System.out.println();
		ContaBanco conta1 = new ContaBanco(numConta, agencia, nome, saldoConta);
		
		System.out.println(conta1);
		
		sc.close();
		
		
		

	}

}
