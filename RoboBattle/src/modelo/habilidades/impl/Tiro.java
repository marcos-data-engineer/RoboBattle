package modelo.habilidades.impl;

import modelo.habilidades.HabilidadeComAlvoSimples;
import modelo.robos.Lutador;
import modelo.robos.LutadorComHabilidade;
import modelo.robos.Robo;
import modelo.robos.RoboComHabilidade;

public class Tiro extends HabilidadeComAlvoSimples{

	private final int CUSTO = 30;
	
	

	@Override
	public void aplicar(LutadorComHabilidade invocador, Lutador alvo) {
		
		
		if(invocador.getEnergia() >= CUSTO) {
			System.out.println("Aplicando a Habilidade Tiro!");
			invocador.reduzEnergia(CUSTO);
			alvo.defender(30);
		}else {
			System.out.println("Energia insuficiente!");
		}
	}
	
	@Override
	public String toString() {
		return "Tiro (30 de dano) E=-30";
	}

	@Override
	public int getCusto() {
		return CUSTO;
	}

}
