package jogo;

import java.util.Scanner;

public class MenuJogo {
	Scanner Jogada = new Scanner(System.in);
	public void menuzinho() {
		System.out.println("Menu Jogo: ");
		System.out.println();
		System.out.println("1 Quiz");
		int joguinho = Jogada.nextInt();
		
		switch (joguinho) {
		case 1 : System.out.println("1 Quiz");
		break;
		default:
			return;
		}
		
		
	}

}
