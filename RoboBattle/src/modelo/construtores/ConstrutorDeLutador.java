package modelo.construtores;

import modelo.robos.Lutador;
import modelo.robos.Robo;

public abstract class ConstrutorDeLutador {
	
	public Lutador construirLutador() {
		return new Robo();
	}
	
	public abstract Lutador construirLutador(String nome);
	
}
