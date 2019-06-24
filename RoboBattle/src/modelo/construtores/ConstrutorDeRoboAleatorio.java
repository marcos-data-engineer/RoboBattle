package modelo.construtores;

import java.util.Random;

import modelo.robos.Lutador;
import modelo.robos.Peca;
import modelo.robos.Robo;

public class ConstrutorDeRoboAleatorio extends ConstrutorDeLutador{

	//protected String robo;

	/* public Lutador construirLutador() {
		Random rand = new Random();
		String nome = "Robo"+rand.nextInt(rand.nextInt(5)+1);
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		
		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	} */

	public Lutador lutador1(){
		Random rand = new Random();
		String nome = "Sonny";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador2(){
		Random rand = new Random();
		String nome = "Sophia";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador3(){
		Random rand = new Random();
		String nome = "Ultron";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador4(){
		Random rand = new Random();
		String nome = "AstroBoy";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador5(){
		Random rand = new Random();
		String nome = "T800";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador6(){
		Random rand = new Random();
		String nome = "Wall-e";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador7(){
		Random rand = new Random();
		String nome = "Baymax";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador8(){
		Random rand = new Random();
		String nome = "C3PO";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador9(){
		Random rand = new Random();
		String nome = "R2D2";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador lutador10(){
		Random rand = new Random();
		String nome = "RoboCop";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}
		
}
