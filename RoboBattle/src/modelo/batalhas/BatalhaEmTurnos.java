package modelo.batalhas;

import modelo.robos.Lutador;

public class BatalhaEmTurnos extends Batalha{
	
	public BatalhaEmTurnos() {
		super();
	}

	public BatalhaEmTurnos(Lutador lutador1, Lutador lutador2) {
		super(lutador1, lutador2);
		//this.lutador1 = lutador1;
		//this.lutador2 = lutador2;
	}

	public void BatalhaEmTurnos2(Lutador lutador3, Lutador lutador4) {
		Batalha2(lutador3, lutador4);
	}

	@Override
	public void iniciar() {
		System.out.println("Iniciando a luta 1 ...");		
		int turno = 0;
		while(lutador1.estaVivo() && lutador2.estaVivo()) {
			lutador1.atacar(lutador2);
			lutador2.atacar(lutador1);
			System.out.println("Turno "+ ++turno);
			System.out.println(lutador1);
			System.out.println(lutador2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(lutador1.estaVivo()) {
			System.out.println(lutador1+" foi o vencedor!\n");
		}else if(lutador2.estaVivo()) {
			System.out.println(lutador2+" foi o vencedor!\n");
		} else {
			System.out.println("EMPATE!");
		}
	} 
	
	@Override
	public void iniciar2() {
		System.out.println("Iniciando a luta 2 ...");		
		int turno = 0;
		while(lutador3.estaVivo() && lutador4.estaVivo()) {
			lutador3.atacar(lutador4);
			lutador4.atacar(lutador3);
			System.out.println("Turno "+ ++turno);
			System.out.println(lutador3);
			System.out.println(lutador4);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(lutador3.estaVivo()) {
			System.out.println(lutador3+" foi o vencedor!\n");
		}else if(lutador4.estaVivo()) {
			System.out.println(lutador4+" foi o vencedor!\n");
		} else {
			System.out.println("EMPATE!\n");
		}
	} 
}

