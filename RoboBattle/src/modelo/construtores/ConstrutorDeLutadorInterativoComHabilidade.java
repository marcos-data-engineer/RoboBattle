package modelo.construtores;

import java.util.Scanner;

import modelo.robos.Lutador;
import modelo.robos.Peca;
import modelo.robos.Robo;
import modelo.robos.RoboComHabilidade;

public class ConstrutorDeLutadorInterativoComHabilidade extends ConstrutorDeLutador{
	private Scanner teclado;

	public ConstrutorDeLutadorInterativoComHabilidade() {
		super();
		this.teclado = new Scanner(System.in);
	}

	@Override
	public Lutador construirLutador() {
		
		
		System.out.println("Digite o nome do Rob�:");
		String nome = teclado.nextLine();
		Peca cabeca = escolhaPeca("Cabe�a");
		Peca tronco = escolhaPeca("Tronco");
		Peca pernas = escolhaPeca("Pernas");
		Peca bracoD = escolhaPeca("Bra�o Direito");
		Peca bracoE = escolhaPeca("Bra�o Esquerdo");
		RoboComHabilidade r = new RoboComHabilidade(nome, cabeca, tronco,bracoE,bracoD, pernas);
		r.setSaude(100);
		return r;
	}
	
	private Peca escolhaPeca(String nomePeca) {
		ConstrutorDePeca construtor = new ConstrutorDePecaComHabilidade();
		Peca p1 = construtor.construirPeca();
		Peca p2 = construtor.construirPeca();
		Peca p3 = construtor.construirPeca();
		
		System.out.println("Escolha o "+nomePeca);
		System.out.println("1 - "+p1);
		System.out.println("2 - "+p2);
		System.out.println("3 - "+p1);
		String opt = teclado.nextLine();
		switch(opt) {
		case "1": return p1; 
		case "2": return p2; 
		case "3": return p3; 
		}
		return p1;
	}
}
