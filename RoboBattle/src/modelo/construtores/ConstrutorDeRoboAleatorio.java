package modelo.construtores;

import java.util.Random;

import modelo.robos.Lutador;
import modelo.robos.Peca;
import modelo.robos.Robo;

public class ConstrutorDeRoboAleatorio extends ConstrutorDeLutador{

	public Lutador construirLutador(String nome){
		Random rand = new Random();
		Peca cabeca = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca tronco = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca pernas = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoEsquerdo = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		Peca bracoDireito = new Peca(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10));
		
		return new Robo(nome, cabeca, tronco, bracoEsquerdo, bracoDireito, pernas);
	}
	
}
