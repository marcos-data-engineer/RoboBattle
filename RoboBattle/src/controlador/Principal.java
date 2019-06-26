package controlador;

import modelo.batalhas.BatalhaEmTurnos;
import modelo.construtores.ConstrutorDeBatalha;
import modelo.construtores.ConstrutorDeRoboAleatorio;

public class Principal {
	public static void main(String[] args) {
						
		ConstrutorDeBatalha combate = new ConstrutorDeBatalha
		(new ConstrutorDeRoboAleatorio(), new BatalhaEmTurnos());
		
		combate.construirBatalha();
	}
}
