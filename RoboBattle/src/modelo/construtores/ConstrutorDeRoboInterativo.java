package modelo.construtores;

import java.util.Scanner;

import modelo.robos.Lutador;
import modelo.robos.Peca;
import modelo.robos.Robo;

public class ConstrutorDeRoboInterativo extends ConstrutorDeLutador {
	private Scanner teclado;

	public ConstrutorDeRoboInterativo() {
		super();
		this.teclado = new Scanner(System.in);
	}

	@Override
	public Lutador construirLutador() {
		Robo r = new Robo();
		r.setSaude(100);
		System.out.println("Digite o nome do Rob�:");
		r.setNome(teclado.nextLine());
		r.setCabeca(escolhaPeca("Cabe�a"));
		r.setTronco(escolhaPeca("Tronco"));
		r.setPernas(escolhaPeca("Pernas"));
		r.setBracoDireito(escolhaPeca("Bra�o Direito"));
		r.setBracoEsquerdo(escolhaPeca("Bra�o Esquerdo"));
		
		return r;
	}
	
	private Peca escolhaPeca(String nomePeca) {
		ConstrutorDePeca construtor = new ConstrutorDePeca();
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
