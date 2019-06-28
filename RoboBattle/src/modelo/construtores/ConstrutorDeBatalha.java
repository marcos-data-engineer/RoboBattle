package modelo.construtores;

import java.util.ArrayList;
import java.util.Scanner;

//import javax.print.attribute.standard.MediaSize.Other;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import modelo.batalhas.Batalha;
//import modelo.batalhas.BatalhaEmTurnos;
import modelo.robos.Lutador;
//import modelo.robos.Robo;
import modelo.robos.Robo;

public class ConstrutorDeBatalha {
	private ConstrutorDeLutador construtorDeLutador;
	private Batalha batalha;
	//protected String lutador1;
	//protected String lutador2;
		
	public ConstrutorDeBatalha(ConstrutorDeLutador construtorDeRobo, Batalha batalha) {
		super();
		this.construtorDeLutador = construtorDeRobo;
		this.batalha = batalha;
	}

	public void construirBatalha() {
		
		// ArrayList<Lutador> lutador = new ArrayList<>();
		// lutador.add(new Robo());		

		// Scanner scan = new Scanner(System.in);
		
		// System.out.println("Escolha um lutador: \n");
		
		// System.out.println("Sonny");
		// System.out.println("Sophia");
		// System.out.println("Ultron");
		// System.out.println("AstroBoy");
		// System.out.println("T800");
		// System.out.println("Wall-e");
		// System.out.println("Baymax");
		// System.out.println("C3PO");
		// System.out.println("R2D2");
		// System.out.println("RoboCop\n");

		// System.out.println("Escolha o desafiante: \n");
		// String escolha1 = scan.next();
		// escolha1 = escolha1.toUpperCase();
		// System.out.println("O robô escolhido foi: " + escolha1 + "\n");

		// System.out.println("Escolha o desafiado: \n");
		// String escolha2 = scan.next();
		// escolha2 = escolha2.toUpperCase();
		// System.out.println("O robô escolhido foi: " + escolha2 + "\n");

		// criando os lutadores
			Lutador lutador1 = construtorDeLutador.construirLutador("Sonny");
			this.batalha.setR1(lutador1);
				
			Lutador lutador2 = construtorDeLutador.construirLutador("Sophia");
			this.batalha.setR2(lutador2);
		
			Lutador lutador3 = construtorDeLutador.construirLutador("Ultron");
			this.batalha.setR3(lutador3);

			Lutador lutador4 = construtorDeLutador.construirLutador("AstroBoy");
			this.batalha.setR4(lutador4);

			// Lutador lutador5 = construtorDeLutador.construirLutador("T-800");
			// this.batalha.setR5(lutador5);

			// Lutador lutador6 = construtorDeLutador.construirLutador("Wall-e");
			// this.batalha.setR6(lutador6);
		
			// Lutador lutador7 = construtorDeLutador.construirLutador("Baymax");
			// this.batalha.setR7(lutador7);

			// Lutador lutador8 = construtorDeLutador.construirLutador("C-3PO");
			// this.batalha.setR8(lutador8);

			// Lutador lutador9 = construtorDeLutador.construirLutador("R2-D2");
			// this.batalha.setR9(lutador9);

			// Lutador lutador10 = construtorDeLutador.construirLutador("RoboCop");
			// this.batalha.setR10(lutador10);

		// else if(escolha1 == "ASTROBOY"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// }

		// else if(escolha1 == "T800"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// }

		// else if(escolha1 == "WALL-E"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// }

		// else if(escolha1 == "BAYMAX"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// }

		// else if(escolha1 == "C3PO"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// }

		// else if(escolha1 == "R2D2"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// }

		// else if(escolha1 == "ROBOCOP"){
		// 	Lutador lutador1 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR1(lutador1);
		// } 
		
		// /* else{
		// 	System.out.println("Digite o nome corretamente!");
		// } */

		// if(escolha2 == "SONNY"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2.equals("SOPHIA")){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SOPHIA");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "ULTRON"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "ASTROBOY"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "T800"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "WALL-E"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "BAYMAX"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "C3PO"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "R2D2"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// }

		// else if(escolha2 == "ROBOCOP"){
		// 	Lutador lutador2 = construtorDeLutador.construirLutador("SONNY");
		// 	this.batalha.setR2(lutador2);
		// } 
		
		/* else{
			System.out.println("Digite o nome corretamente!");
		} */
		
		batalha.iniciar();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		batalha.iniciar2();

		//scan.close();

	}
}
