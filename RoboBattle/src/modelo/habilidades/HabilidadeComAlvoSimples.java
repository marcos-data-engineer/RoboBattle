package modelo.habilidades;

import modelo.robos.Lutador;
import modelo.robos.LutadorComHabilidade;

public abstract class HabilidadeComAlvoSimples extends Habilidade {

	public abstract void aplicar(LutadorComHabilidade invocador, Lutador alvo);
	
}
