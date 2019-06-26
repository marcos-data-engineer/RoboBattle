package modelo.batalhas;


import modelo.robos.Lutador;
//import modelo.robos.Robo;

public class BatalhaEmTurnos extends Batalha{

	public BatalhaEmTurnos() {
		super();
	}

	public BatalhaEmTurnos(Lutador r1, Lutador r2) {
		super(r1, r2);
	}

	@Override
	public void iniciar() {
		int turno = 0;
		while(r1.estaVivo() && r2.estaVivo()) {
			r1.atacar(r2);
			r2.atacar(r1);
			System.out.println("Turno "+ ++turno);
			System.out.println(r1);
			System.out.println(r2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(r1.estaVivo()) {
			System.out.println(r1+" foi o vencedor!");
		}else if(r2.estaVivo()) {
			System.out.println(r2+" foi o vencedor!");
		} else {
			System.out.println("EMPATE!");
		}
	}
	
	//protected Lutador lutador1;
	//protected Lutador lutador2;
	
	/* public BatalhaEmTurnos() {
		super();
//		this.lutador1 = new Robo();
//		this.lutador2 = new Robo();
	}

	public BatalhaEmTurnos(Lutador lutador1, Lutador lutador2) {
		super(lutador1, lutador2);
		//this.lutador1 = lutador1;
		//this.lutador2 = lutador2;
	}

	@Override
	public void iniciar() {
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
			System.out.println(lutador1+" foi o vencedor!");
		}else if(lutador2.estaVivo()) {
			System.out.println(lutador2+" foi o vencedor!");
		} else {
			System.out.println("EMPATE!");
		}
	} */

}

