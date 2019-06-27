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
	//protected String lutador1;
	//protected String lutador2;
		
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
		String escolha1 = scan.next();
		escolha1 = escolha1.toUpperCase();
		System.out.println("O robô escolhido foi: " + escolha1 + "\n");

		System.out.println("Escolha o desafiado: \n");
		String escolha2 = scan.next();
		escolha2 = escolha2.toUpperCase();
		System.out.println("O robô escolhido foi: " + escolha2 + "\n");

		if(escolha1 == "SONNY"){
			Lutador lutador1 = construtorDeLutador.robo1();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "SOPHIA"){
			Lutador lutador1 = construtorDeLutador.robo2();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "ULTRON"){
			Lutador lutador1 = construtorDeLutador.robo3();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "ASTROBOY"){
			Lutador lutador1 = construtorDeLutador.robo4();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "T800"){
			Lutador lutador1 = construtorDeLutador.robo5();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "WALL-E"){
			Lutador lutador1 = construtorDeLutador.robo6();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "BAYMAX"){
			Lutador lutador1 = construtorDeLutador.robo7();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "C3PO"){
			Lutador lutador1 = construtorDeLutador.robo8();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "R2D2"){
			Lutador lutador1 = construtorDeLutador.robo9();
			this.batalha.setR1(lutador1);
		}

		else if(escolha1 == "ROBOCOP"){
			Lutador lutador1 = construtorDeLutador.robo10();
			this.batalha.setR1(lutador1);
		} 
		
		/* else{
			System.out.println("Digite o nome corretamente!");
		} */

		if(escolha2 == "SONNY"){
			Lutador lutador2 = construtorDeLutador.robo1();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "SOPHIA"){
			Lutador lutador2 = construtorDeLutador.robo2();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "ULTRON"){
			Lutador lutador2 = construtorDeLutador.robo3();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "ASTROBOY"){
			Lutador lutador2 = construtorDeLutador.robo4();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "T800"){
			Lutador lutador2 = construtorDeLutador.robo5();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "WALL-E"){
			Lutador lutador2 = construtorDeLutador.robo6();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "BAYMAX"){
			Lutador lutador2 = construtorDeLutador.robo7();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "C3PO"){
			Lutador lutador2 = construtorDeLutador.robo8();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "R2D2"){
			Lutador lutador2 = construtorDeLutador.robo9();
			this.batalha.setR2(lutador2);
		}

		else if(escolha2 == "ROBOCOP"){
			Lutador lutador2 = construtorDeLutador.robo10();
			this.batalha.setR2(lutador2);
		} 
		
		/* else{
			System.out.println("Digite o nome corretamente!");
		} */

		/* switch(lutador1){
			case "SONNY":
				Lutador lutador1 = construtorDeLutador.robo1();
				this.batalha.setR1(lutador1);
				break;
			
			case "SOPHIA":
				Lutador lutador1 = construtorDeLutador.robo2();
				this.batalha.setR2(lutador1);
				break;
			
			case "ULTRON":
				Lutador ultron = construtorDeLutador.robo3();
				this.batalha.setR3(ultron);
				break;

			case "ASTROBOY":
				Lutador astroboy = construtorDeLutador.robo4();
				this.batalha.setR4(astroboy);
				break;
			
			case "T800":
				Lutador t800 = construtorDeLutador.robo5();
				this.batalha.setR5(t800);
				break;
			
			case "WALL-E":
				Lutador walle = construtorDeLutador.robo6();
				this.batalha.setR6(walle);
				break;

			case "BAYMAX":
				Lutador baymax = construtorDeLutador.robo7();
				this.batalha.setR7(baymax);
				break;

			case "C3PO":
				Lutador c3po = construtorDeLutador.robo8();
				this.batalha.setR8(c3po);
				break;

			case "R2D2":
				Lutador r2d2 = construtorDeLutador.robo9();
				this.batalha.setR9(r2d2);
				break;

			case "ROBOCOP":
				Lutador robocop = construtorDeLutador.robo10();
				this.batalha.setR10(robocop);
				break;

			default:
				System.out.println("Digite o nome corretamente!");
				break;

		};

		switch(lutador2){
		case "SONNY":
			Lutador sonny = construtorDeLutador.robo1();
			this.batalha.setR1(sonny);
			break;
		
		case "SOPHIA":
			Lutador sophia = construtorDeLutador.robo2();
			this.batalha.setR2(sophia);
			break;
		
		case "ULTRON":
			Lutador ultron = construtorDeLutador.robo3();
			this.batalha.setR3(ultron);
			break;

		case "ASTROBOY":
			Lutador astroboy = construtorDeLutador.robo4();
			this.batalha.setR4(astroboy);
			break;
		
		case "T800":
			Lutador t800 = construtorDeLutador.robo5();
			this.batalha.setR5(t800);
			break;
		
		case "WALL-E":
			Lutador walle = construtorDeLutador.robo6();
			this.batalha.setR6(walle);
			break;

		case "BAYMAX":
			Lutador baymax = construtorDeLutador.robo7();
			this.batalha.setR7(baymax);
			break;

		case "C3PO":
			Lutador c3po = construtorDeLutador.robo8();
			this.batalha.setR8(c3po);
			break;

		case "R2D2":
			Lutador r2d2 = construtorDeLutador.robo9();
			this.batalha.setR9(r2d2);
			break;

		case "ROBOCOP":
			Lutador robocop = construtorDeLutador.robo10();
			this.batalha.setR10(robocop);
			break;

		default:
			System.out.println("Digite o nome corretamente!");
			break;
		}; */

		batalha.iniciar();

		scan.close();

	}
}
