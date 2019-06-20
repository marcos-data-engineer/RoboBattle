package controlador;

//import batalhas.BatalhaComHabilidades;
import modelo.batalhas.BatalhaEmTurnos;
import modelo.construtores.ConstrutorDeBatalha;
import modelo.construtores.ConstrutorDeRoboAleatorio;
import modelo.construtores.ConstrutorDeRoboInterativo;
import modelo.construtores.ConstrutorDeLutadorInterativoComHabilidade;

public class Principal {
	public static void main(String[] args) {
		ConstrutorDeBatalha combate = new ConstrutorDeBatalha(new ConstrutorDeRoboAleatorio(), new BatalhaEmTurnos());
		combate.construirBatalha();
	}
}
