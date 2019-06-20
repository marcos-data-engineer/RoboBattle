package modelo.habilidades.impl;

import java.util.Random;

import modelo.habilidades.GeradorDeHabilidade;
import modelo.habilidades.Habilidade;

public class GeradorDeHabilidadeAleatoria implements GeradorDeHabilidade{

	private Habilidade[] habilidades;
	private int qtde;
	
	public GeradorDeHabilidadeAleatoria() {
		super();
		this.qtde = 1;
		this.habilidades = new Habilidade[qtde];
		this.habilidades[0] = new Tiro();
	}



	@Override
	public Habilidade gerarHabilidade() {
		
		return this.habilidades[new Random().nextInt(qtde)];
	}

}
