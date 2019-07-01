package modelo.construtores;

import modelo.batalhas.Batalha;
import modelo.robos.Lutador;

public class ConstrutorDeBatalha {
	/**
	 *
	 */

	private ConstrutorDeLutador construtorDeLutador;
	private Batalha batalha;

	public ConstrutorDeBatalha(ConstrutorDeLutador construtorDeRobo, Batalha batalha) {
		super();
		this.construtorDeLutador = construtorDeRobo;
		this.batalha = batalha;
	}

	public void construirBatalha() {
				
			Lutador lutador1 = construtorDeLutador.construirLutador("Sonny");
			this.batalha.setR1(lutador1);
				
			Lutador lutador2 = construtorDeLutador.construirLutador("Sophia");
			this.batalha.setR2(lutador2);
		
			Lutador lutador3 = construtorDeLutador.construirLutador("Ultron");
			this.batalha.setR3(lutador3);

			Lutador lutador4 = construtorDeLutador.construirLutador("AstroBoy");
			this.batalha.setR4(lutador4);

			 Lutador lutador5 = construtorDeLutador.construirLutador("T800");
			 this.batalha.setR5(lutador5);

			 Lutador lutador6 = construtorDeLutador.construirLutador("WallE");
			 this.batalha.setR6(lutador6);
		
			 Lutador lutador7 = construtorDeLutador.construirLutador("Baymax");
			 this.batalha.setR7(lutador7);

			 Lutador lutador8 = construtorDeLutador.construirLutador("C3PO");
			 this.batalha.setR8(lutador8);
			
		batalha.iniciar();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		batalha.iniciar2();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		batalha.iniciar3();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		batalha.iniciar4();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		 batalha.iniciar5();

		 try {
		 	Thread.sleep(5000);
		 } catch (InterruptedException e) {
		 	e.printStackTrace();
		 }

		 batalha.iniciar6();

		 try {
		 	Thread.sleep(5000);
		 } catch (InterruptedException e) {
		 	e.printStackTrace();
		 }

		 batalha.iniciar7();

		 try {
		 	Thread.sleep(5000);
		 } catch (InterruptedException e) {
		 	e.printStackTrace();
		 }
	
	}

}