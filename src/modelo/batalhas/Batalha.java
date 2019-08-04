package modelo.batalhas;

import modelo.robos.*;

public abstract class Batalha {
	
	protected Lutador lutador1;
	protected Lutador lutador2;
	protected Lutador lutador3;
	protected Lutador lutador4;
	protected Lutador lutador5;
	protected Lutador lutador6;
	protected Lutador lutador7;
	protected Lutador lutador8;
	protected Lutador vencedorLuta1;
	protected Lutador vencedorLuta2;
	protected Lutador vencedorLuta3;
	protected Lutador vencedorLuta4;
	protected Lutador vencedorSemifinal1;
	protected Lutador vencedorSemifinal2;
	
	public Batalha() {
		super();
		this.lutador1 = new Robo();
		this.lutador2 = new Robo();
		this.lutador3 = new Robo();
		this.lutador4 = new Robo();
		this.lutador5 = new Robo();
		this.lutador6 = new Robo();
		this.lutador7 = new Robo();
		this.lutador8 = new Robo();
	}
	
	public Batalha(Lutador lutador1, Lutador lutador2) {
		super();
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	}

	public abstract void iniciar();
	
	public abstract void iniciar2();

	public abstract void iniciar3();

	public abstract void iniciar4();

	public abstract void iniciar5();

	public abstract void iniciar6();

	public abstract void iniciar7();

	public void setR1(Lutador lutador1) {
		this.lutador1 = lutador1;
	}

	public void setR2(Lutador lutador2) {
		this.lutador2 = lutador2;
	}

	public void setR3(Lutador lutador3) {
		this.lutador3 = lutador3;
	}

	public void setR4(Lutador lutador4) {
		this.lutador4 = lutador4;
	}

	public void setR5(Lutador lutador5) {
		this.lutador5 = lutador5;
	}

	public void setR6(Lutador lutador6) {
		this.lutador6 = lutador6;
	}
	
	public void setR7(Lutador lutador7) {
		this.lutador7 = lutador7;
	}

	public void setR8(Lutador lutador8) {
		this.lutador8 = lutador8;
	}

}
