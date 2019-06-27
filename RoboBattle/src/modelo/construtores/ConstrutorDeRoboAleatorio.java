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
	
	
	public Lutador construirLutador(String nome){
		Random rand = new Random();
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		
		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo1(){
		Random rand = new Random();
		String nome = "SONNY";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		
		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo2(){
		Random rand = new Random();
		String nome = "SOPHIA";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo3(){
		Random rand = new Random();
		String nome = "ULTRON";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo4(){
		Random rand = new Random();
		String nome = "ASTROBOY";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo5(){
		Random rand = new Random();
		String nome = "T800";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo6(){
		Random rand = new Random();
		String nome = "WALL-E";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo7(){
		Random rand = new Random();
		String nome = "BAYMAX";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo8(){
		Random rand = new Random();
		String nome = "C3PO";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo9(){
		Random rand = new Random();
		String nome = "R2D2";
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));

		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}

	public Lutador robo10(){
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
