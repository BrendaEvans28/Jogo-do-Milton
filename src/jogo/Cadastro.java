package jogo;

import java.util.Scanner;

public class Cadastro {
	Scanner rio = new Scanner(System.in);
	public void Cadastrar() {
		System.out.println("Qual � o seu Nome? ");
		String nome = rio.nextLine();
		
		System.out.println("Qual seu Sobrenome? ");
		String sobrenome = rio.nextLine();
		
		System.out.println("Qual seu Apelido? ");
		String apelido = rio.nextLine();
		
		System.out.println("Ol� " + apelido +" Seja bem vindo, vamos jogar!!!");
		
		
	}

}
