package modelo.batalhas;

import modelo.robos.*;
//import modelo.construtores.*;

public abstract class Batalha {
	
	protected Lutador lutador1;
	protected Lutador lutador2;
	protected Lutador lutador3;
	protected Lutador lutador4;
	protected Lutador lutador5;
	protected Lutador lutador6;
	protected Lutador lutador7;
	protected Lutador lutador8;
	protected Lutador lutador9;
	protected Lutador lutador10;
	
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
		this.lutador9 = new Robo();
		this.lutador10 = new Robo();
	}

	public Batalha(Lutador lutador1, Lutador lutador2) {
		super();
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	}

	public void Batalha2(Lutador lutador3, Lutador lutador4) {
		//super();
		this.lutador3 = lutador3;
		this.lutador4 = lutador4;
	}

	public abstract void iniciar();
	
	public abstract void iniciar2();

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

	/* protected Lutador robo1;
	protected Lutador robo2;
	protected Lutador robo3;
	protected Lutador robo4;
	protected Lutador robo5;
	protected Lutador robo6;
	protected Lutador robo7;
	protected Lutador robo8;
	protected Lutador robo9;
	protected Lutador robo10; */
		
	/* public Batalha() {
		super();
		this.robo1 = new Robo();
		this.robo2 = new Robo();
		this.robo3 = new Robo();
		this.robo4 = new Robo();
		this.robo5 = new Robo();
		this.robo6 = new Robo();
		this.robo7 = new Robo();
		this.robo8 = new Robo();
		this.robo9 = new Robo();
		this.robo10 = new Robo();
	}
 */

	/* public Batalha(){
		super();
		this.lutador1 = new Robo();
		this.lutador2 = new Robo();
	}

	public Batalha(Lutador lutador1, Lutador lutador2){
		super();
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	} */

	/* public Batalha(Lutador r1, Lutador r2, Lutador r3,
				   Lutador r4, Lutador r5, Lutador r6,
				   Lutador r7, Lutador r8, Lutador r9,
				   Lutador r10){
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
		
	/* public void setR1(Lutador lutador1) {
		this.lutador1 = lutador1;
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
	} */
	
}
