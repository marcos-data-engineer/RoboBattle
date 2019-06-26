package modelo.batalhas;


import modelo.robos.Lutador;
//import modelo.robos.Robo;

public class BatalhaEmTurnos extends Batalha{
	
	protected Lutador lutador1;
	protected Lutador lutador2;
	
	public BatalhaEmTurnos() {
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
	}

}
