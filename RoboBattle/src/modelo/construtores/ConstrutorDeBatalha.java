package modelo.construtores;

import java.util.Scanner;

//import javax.print.attribute.standard.MediaSize.Other;

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
		
		System.out.println("Escolha um lutador: \n");
		
		System.out.println("Sonny");
		System.out.println("Sophia");
		System.out.println("Ultron");
		System.out.println("AstroBoy");
		System.out.println("T800");
		System.out.println("Wall-e");
		System.out.println("Baymax");
		System.out.println("C3PO");
		System.out.println("R2D2");
		System.out.println("RoboCop\n");

		System.out.println("Escolha o desafiante: \n");
		lutador1 = scan.next();
		lutador1 = lutador1.toUpperCase();
		System.out.println("O robô escolhido foi: " + lutador1 + "\n");

		System.out.println("Escolha o desafiado: \n");
		lutador2 = scan.next();
		lutador2.toUpperCase();
		System.out.println("O robô escolhido foi: " + lutador2 + "\n");

		switch(lutador1){
			case "SONNY":
				Lutador sonny = construtorDeLutador.lutador1();
				this.batalha.setR1(sonny);
				break;
			
			case "SOPHIA":
				Lutador sophia = construtorDeLutador.lutador1();
				this.batalha.setR2(sophia);
				break;
			
			case "ULTRON":
				Lutador ultron = construtorDeLutador.lutador1();
				this.batalha.setR3(ultron);
				break;

			case "ASTROBOY":
				Lutador astroboy = construtorDeLutador.lutador1();
				this.batalha.setR4(astroboy);
				break;
			
			case "T800":
				Lutador t800 = construtorDeLutador.lutador1();
				this.batalha.setR5(t800);
				break;
			
			case "WALL-E":
				Lutador walle = construtorDeLutador.lutador1();
				this.batalha.setR6(walle);
				break;

			case "BAYMAX":
				Lutador baymax = construtorDeLutador.lutador1();
				this.batalha.setR7(baymax);
				break;

			case "C3PO":
				Lutador c3po = construtorDeLutador.lutador1();
				this.batalha.setR8(c3po);
				break;

			case "R2D2":
				Lutador r2d2 = construtorDeLutador.lutador1();
				this.batalha.setR9(r2d2);
				break;

			case "ROBOCOP":
				Lutador robocop = construtorDeLutador.lutador1();
				this.batalha.setR10(robocop);
				break;

			default:
				System.out.println("Digite o nome corretamente!");
				break;

		};

		switch(lutador2){
			case "SONNY":
				Lutador sonny = construtorDeLutador.lutador2();
				this.batalha.setR1(sonny);
				break;
			
			case "SOPHIA":
				Lutador sophia = construtorDeLutador.lutador2();
				this.batalha.setR2(sophia);
				break;
			
			case "ULTRON":
				Lutador ultron = construtorDeLutador.lutador2();
				this.batalha.setR3(ultron);
				break;

			case "ASTROBOY":
				Lutador astroboy = construtorDeLutador.lutador2();
				this.batalha.setR4(astroboy);
				break;
			
			case "T800":
				Lutador t800 = construtorDeLutador.lutador2();
				this.batalha.setR5(t800);
				break;
			
			case "WALL-E":
				Lutador walle = construtorDeLutador.lutador2();
				this.batalha.setR6(walle);
				break;

			case "BAYMAX":
				Lutador baymax = construtorDeLutador.lutador2();
				this.batalha.setR7(baymax);
				break;

			case "C3PO":
				Lutador c3po = construtorDeLutador.lutador2();
				this.batalha.setR8(c3po);
				break;

			case "R2D2":
				Lutador r2d2 = construtorDeLutador.lutador2();
				this.batalha.setR9(r2d2);
				break;

			case "ROBOCOP":
				Lutador robocop = construtorDeLutador.lutador2();
				this.batalha.setR10(robocop);
				break;

			default:
				System.out.println("Digite o nome corretamente!");
				break;

		};

		batalha.iniciar();

		scan.close();

	}
}
