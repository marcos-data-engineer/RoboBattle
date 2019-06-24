package modelo.construtores;

import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import modelo.batalhas.Batalha;
//import modelo.batalhas.BatalhaEmTurnos;
import modelo.robos.Lutador;
//import modelo.robos.Robo;

public class ConstrutorDeBatalha {
	private ConstrutorDeLutador construtorDeLutador;
	private Batalha batalha;
	protected String lutador1;
	protected String lutador2;
		
	public ConstrutorDeBatalha(ConstrutorDeLutador construtorDeRobo, Batalha batalha) {
		super();
		this.construtorDeLutador = construtorDeRobo;
		this.batalha = batalha;
	}

	public void construirBatalha() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutadores: /n");
		
		System.out.println("Digite r1 para Sonny");
		System.out.println("Digite r2 para Sophia");
		System.out.println("Digite r3 para Ultron");
		System.out.println("Digite r4 para AstroBoy");
		System.out.println("Digite r5 para T800");
		System.out.println("Digite r6 para Wall-e");
		System.out.println("Digite r7 para Baymax");
		System.out.println("Digite r8 para C3PO");
		System.out.println("Digite r9 para R2D2");
		System.out.println("Digite r10 para RoboCop");

		System.out.println("Escolha o desafiante: ");
		lutador1 = scan.next();

		System.out.println("Escolha o desafiado: ");
		lutador2 = scan.next();

		switch(lutador1){
			case "r1":
				Lutador r1 = construtorDeLutador.lutador1();
				this.batalha.setR1(r1);
				break;
			
			case "r2":
				Lutador r2 = construtorDeLutador.lutador1();
				this.batalha.setR2(r2);
				break;
			
			case "r3":
				Lutador r3 = construtorDeLutador.lutador1();
				this.batalha.setR3(r3);
				break;

			case "r4":
				Lutador r4 = construtorDeLutador.lutador1();
				this.batalha.setR4(r4);
				break;
			
			case "r5":
				Lutador r5 = construtorDeLutador.lutador1();
				this.batalha.setR5(r5);
				break;
			
			case "r6":
				Lutador r6 = construtorDeLutador.lutador1();
				this.batalha.setR6(r6);
				break;

			case "r7":
				Lutador r7 = construtorDeLutador.lutador1();
				this.batalha.setR7(r7);
				break;

			case "r8":
				Lutador r8 = construtorDeLutador.lutador1();
				this.batalha.setR8(r8);
				break;

			case "r9":
				Lutador r9 = construtorDeLutador.lutador1();
				this.batalha.setR9(r9);
				break;

			case "r10":
				Lutador r10 = construtorDeLutador.lutador1();
				this.batalha.setR10(r10);
				break;

		};

		switch(lutador2){
			case "r1":
				Lutador r1 = construtorDeLutador.lutador1();
				this.batalha.setR1(r1);
				break;
			
			case "r2":
				Lutador r2 = construtorDeLutador.lutador1();
				this.batalha.setR2(r2);
				break;
			
			case "r3":
				Lutador r3 = construtorDeLutador.lutador1();
				this.batalha.setR3(r3);
				break;

			case "r4":
				Lutador r4 = construtorDeLutador.lutador1();
				this.batalha.setR4(r4);
				break;
			
			case "r5":
				Lutador r5 = construtorDeLutador.lutador1();
				this.batalha.setR5(r5);
				break;
			
			case "r6":
				Lutador r6 = construtorDeLutador.lutador1();
				this.batalha.setR6(r6);
				break;

			case "r7":
				Lutador r7 = construtorDeLutador.lutador1();
				this.batalha.setR7(r7);
				break;

			case "r8":
				Lutador r8 = construtorDeLutador.lutador1();
				this.batalha.setR8(r8);
				break;

			case "r9":
				Lutador r9 = construtorDeLutador.lutador1();
				this.batalha.setR9(r9);
				break;

			case "r10":
				Lutador r10 = construtorDeLutador.lutador1();
				this.batalha.setR10(r10);
				break;

		};

		batalha.iniciar();

		scan.close();

	}
}
