package jogo;

import java.util.Scanner;

public class Menu {
	Scanner Menu =  new Scanner(System.in);
	public void main() {
		System.out.println("Menu principal: ");
		System.out.println();
		System.out.println("1 Jogar");
		System.out.println("2 Cadrastrar Jogadores");
		System.out.println("3 Sobre");
		System.out.println("4 Sair");
		System.out.println();
		System.out.println("Escolha um número do Menu: ");
		
		int escolha = Menu.nextInt();
		switch(escolha) {
		case 1 : System.out.println("1 Jogar");
		break;
		case 2 : System.out.println("2 Cadastrar Jogadores");
		Cadastro obj = new Cadastro();
		obj.Cadastrar();
		break;
		case 3 : System.out.println("3 Sobre");
		Sobre obj1 = new Sobre();
		obj1.informações();
		break;
		case 4 : System.out.println("4 Sair ");
		System.out.println("falou rapaziada !!!!!!!!!!");
		System.exit(0);
		break;
		default:
			return;
			
		
		}
	}
}
