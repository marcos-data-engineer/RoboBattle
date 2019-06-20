package modelo.construtores;

import java.util.Random;

import modelo.habilidades.GeradorDeHabilidade;
import modelo.habilidades.impl.GeradorDeHabilidadeAleatoria;
import modelo.robos.Peca;
import modelo.robos.PecaComHabilidade;

public class ConstrutorDePecaComHabilidade extends ConstrutorDePeca {

	public Peca construirPeca() {
		GeradorDeHabilidade gerador = new GeradorDeHabilidadeAleatoria();
		PecaComHabilidade peca = new PecaComHabilidade(super.construirPeca());
		if(new Random().nextInt(100)<20) {
			peca.setHabilidade(gerador.gerarHabilidade());
		}
		return peca;
		
	}
	
}
