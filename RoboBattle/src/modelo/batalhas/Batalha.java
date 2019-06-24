package modelo.batalhas;

import modelo.robos.Lutador;
import modelo.robos.Robo;
import modelo.construtores.*;

public abstract class Batalha {
	
	protected Lutador r1;
	protected Lutador r2;
	protected Lutador r3;
	protected Lutador r4;
	protected Lutador r5;
	protected Lutador r6;
	protected Lutador r7;
	protected Lutador r8;
	protected Lutador r9;
	protected Lutador r10;
	
	public Batalha() {
		super();
		this.r1 = new Robo();
		this.r2 = new Robo();
		this.r3 = new Robo();
		this.r4 = new Robo();
		this.r5 = new Robo();
		this.r6 = new Robo();
		this.r7 = new Robo();
		this.r8 = new Robo();
		this.r9 = new Robo();
		this.r10 = new Robo();
	}


	public Batalha(Lutador lutador1, Lutador lutador2){
		super();
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	}

	/* public Batalha(Lutador r1, Lutador r2,
				   Lutador r3, Lutador r4,
				   Lutador r5, Lutador r6,
				   Lutador r7, Lutador r8,
				   Lutador r9, Lutador r10) {
		super();
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
		this.r5 = r5;
		this.r6 = r6;
		this.r7 = r7;
		this.r8 = r8;
		this.r9 = r9;
		this.r10 = r10;
	} */
	
	public abstract void iniciar();

	public void setR1(Lutador r1) {
		this.r1 = r1;
	}

	public void setR2(Lutador r2) {
		this.r2 = r2;
	}
	
	public void setR3(Lutador r3) {
		this.r3 = r3;
	}

	public void setR4(Lutador r4) {
		this.r4 = r4;
	}

	public void setR5(Lutador r5) {
		this.r5 = r5;
	}
	
	public void setR6(Lutador r6) {
		this.r6 = r6;
	}

	public void setR7(Lutador r7) {
		this.r7 = r7;
	}

	public void setR8(Lutador r8) {
		this.r8 = r8;
	}

	public void setR9(Lutador r9) {
		this.r9 = r9;
	}

	public void setR10(Lutador r10) {
		this.r10 = r10;
	}
	
}
