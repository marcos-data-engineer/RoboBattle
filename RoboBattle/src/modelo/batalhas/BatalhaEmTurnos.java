package modelo.batalhas;

import modelo.robos.Lutador;

public class BatalhaEmTurnos extends Batalha{
	
	Lutador vencedorLuta1;
	Lutador vencedorLuta2;
	Lutador vencedorLuta3;
	Lutador vencedorLuta4;
	Lutador vencedorSemifinal1;
	Lutador vencedorSemifinal2;
	// Lutador vencedorLuta5;

	public BatalhaEmTurnos() {
		super();
	}
	
	@Override
	public void iniciar() {
		System.out.println("\n BEM VINDOS AO CAMPEONATO MUNDIAL DE ROBÔS \n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n São 8 grandes robôs da história, e somente um chegará ao fim desta batalha Épica! \n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n São eles: Sonny, Sophia, Ultron, Astro Boy, T-800, Wall-e, Baymax e C-3PO \n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Que se iniciem os combates!!! .............................................................................................................................");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("..................................................................................................................................................................");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("..................................................................................................................................................................");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nIniciando a luta 1 ...\n");	
		System.out.println("\nSonny vs Sophia\n");	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int turno = 0;
		while(lutador1.estaVivo() && lutador2.estaVivo()) {
			lutador1.atacar(lutador2);
			lutador2.atacar(lutador1);
			System.out.println("\nTurno "+ ++turno + "\n");
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
			vencedorLuta1 = lutador1;
		}else if(lutador2.estaVivo()) {
			System.out.println(lutador2+" foi o vencedor!\n");
			vencedorLuta1 = lutador2;
		} else {
			System.out.println("\nEMPATE!\n");
			iniciar();
		}
	} 
	
	@Override
	public void iniciar2() {
		System.out.println("\nIniciando a luta 2 ...\n");	
		System.out.println("\nUltron vs AstroBoy\n");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int turno = 0;
		while(lutador3.estaVivo() && lutador4.estaVivo()) {
			lutador3.atacar(lutador4);
			lutador4.atacar(lutador3);
			System.out.println("\nTurno "+ ++turno + "\n");
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
			vencedorLuta2 = lutador3;
		}else if(lutador4.estaVivo()) {
			System.out.println(lutador4+" foi o vencedor!\n");
			vencedorLuta2 = lutador4;
		} else {
			System.out.println("EMPATE!\n");
			iniciar2();
		}
	} 

	@Override
	public void iniciar3() {
		System.out.println("\nIniciando a luta 3 ...\n");	
		System.out.println("\nT-800 vs Wall-e\n");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int turno = 0;
		while(lutador5.estaVivo() && lutador6.estaVivo()) {
			lutador5.atacar(lutador6);
			lutador6.atacar(lutador5);
			System.out.println("\nTurno "+ ++turno + "\n");
			System.out.println(lutador5);
			System.out.println(lutador6);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(lutador5.estaVivo()) {
			System.out.println(lutador5+" foi o vencedor!\n");
			vencedorLuta3 = lutador5;
		}else if(lutador6.estaVivo()) {
			System.out.println(lutador6+" foi o vencedor!\n");
			vencedorLuta3 = lutador6;
		} else {
			System.out.println("EMPATE!\n");
			iniciar3();
		}
	} 

	@Override
	public void iniciar4() {
		System.out.println("\nIniciando a luta 4 ...\n");	
		System.out.println("\nBaymax vs C-3PO\n");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int turno = 0;
		while(lutador7.estaVivo() && lutador8.estaVivo()) {
			lutador7.atacar(lutador8);
			lutador8.atacar(lutador7);
			System.out.println("\nTurno "+ ++turno + "\n");
			System.out.println(lutador7);
			System.out.println(lutador8);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(lutador7.estaVivo()) {
			System.out.println(lutador7+" foi o vencedor!\n");
			vencedorLuta4 = lutador7;
		}else if(lutador4.estaVivo()) {
			System.out.println(lutador8+" foi o vencedor!\n");
			vencedorLuta4 = lutador8;
		} else {
			System.out.println("EMPATE!\n");
			iniciar4();
		}
	} 

	 @Override
	 public void iniciar5() {
		 System.out.println("\nIniciando a 1ª semifinal ...\n");	
		 System.out.println("\nOs lutadores estão cansados por causa da primeira luta! ...\n");
	 	System.out.println("\n"+vencedorLuta1+" vs "+vencedorLuta2+"\n");

	 	try {
	 		Thread.sleep(5000);
	 	} catch (InterruptedException e) {
	 		e.printStackTrace();
	 	}
		
	 	int turno = 0;
	 	while(vencedorLuta1.estaVivo() && vencedorLuta2.estaVivo()) {
	 		vencedorLuta1.atacar(vencedorLuta2);
	 		vencedorLuta2.atacar(vencedorLuta1);
	 		System.out.println("\nTurno "+ ++turno + "\n");
	 		System.out.println(vencedorLuta1);
	 		System.out.println(vencedorLuta2);
	 		try {
	 			Thread.sleep(1000);
	 		} catch (InterruptedException e) {
	 			e.printStackTrace();
	 		}
	 	}
	 	if(vencedorLuta1.estaVivo()) {
	 		System.out.println(vencedorLuta1+" foi o vencedor!\n");
	 		vencedorSemifinal1 = vencedorLuta1;
	 	}else if(vencedorLuta2.estaVivo()) {
	 		System.out.println(vencedorLuta2+" foi o vencedor!\n");
	 		vencedorSemifinal1 = vencedorLuta2;
	 	} else {
	 		System.out.println("EMPATE!\n");
	 		iniciar5();
	 	}
	 } 

	 @Override
	 public void iniciar6() {
		 System.out.println("\nIniciando a 2ª semifinal ...\n");	
		 System.out.println("\nOs lutadores estão cansados por causa da primeira luta! ...\n");
	 	System.out.println("\n"+vencedorLuta3+" vs "+vencedorLuta4+"\n");

	 	try {
	 		Thread.sleep(5000);
	 	} catch (InterruptedException e) {
	 		e.printStackTrace();
	 	}
		
	 	int turno = 0;
	 	while(vencedorLuta3.estaVivo() && vencedorLuta4.estaVivo()) {
	 		vencedorLuta3.atacar(vencedorLuta4);
	 		vencedorLuta4.atacar(vencedorLuta1);
	 		System.out.println("\nTurno "+ ++turno + "\n");
	 		System.out.println(vencedorLuta3);
	 		System.out.println(vencedorLuta4);
	 		try {
	 			Thread.sleep(1000);
	 		} catch (InterruptedException e) {
	 			e.printStackTrace();
	 		}
	 	}
	 	if(vencedorLuta1.estaVivo()) {
	 		System.out.println(vencedorLuta3+" foi o vencedor!\n");
	 		vencedorSemifinal2 = vencedorLuta3;
	 	}else if(vencedorLuta4.estaVivo()) {
	 		System.out.println(vencedorLuta4+" foi o vencedor!\n");
	 		vencedorSemifinal2 = vencedorLuta4;
	 	} else {
	 		System.out.println("EMPATE!\n");
	 		iniciar6();
	 	}
	 } 

	 @Override
	 public void iniciar7() {
		 System.out.println("\nIniciando a grande Final ...\n");
		 System.out.println("\nEsta luta será rápida, pois os lutadores já estão muito danificados!!!\n");	
	 	System.out.println("\n"+vencedorSemifinal1+" vs "+vencedorSemifinal2+"\n");

	 	try {
	 		Thread.sleep(5000);
	 	} catch (InterruptedException e) {
	 		e.printStackTrace();
	 	}
		
	 	int turno = 0;
	 	while(vencedorSemifinal1.estaVivo() && vencedorSemifinal2.estaVivo()) {
	 		vencedorSemifinal1.atacar(vencedorSemifinal2);
	 		vencedorSemifinal2.atacar(vencedorSemifinal1);
	 		System.out.println("\nTurno "+ ++turno + "\n");
	 		System.out.println(vencedorSemifinal1);
	 		System.out.println(vencedorSemifinal2);
	 		try {
	 			Thread.sleep(1000);
	 		} catch (InterruptedException e) {
	 			e.printStackTrace();
	 		}
	 	}
	 	if(vencedorLuta1.estaVivo()) {
	 		System.out.println(vencedorSemifinal1+" foi o vencedor!\n");
	 		System.out.println("PARABÉNS "+vencedorSemifinal1+" VOCÊ FOI O GRANDE CAMPEÃO!!!\n");
	 	}else if(vencedorSemifinal2.estaVivo()) {
	 		System.out.println(vencedorSemifinal2+" foi o vencedor!\n");
	 		System.out.println("PARABÉNS "+vencedorSemifinal2+" VOCÊ FOI O GRANDE CAMPEÃO!!!\n");
	 	} else {
	 		System.out.println("EMPATE!\n");
	 		iniciar7();
	 	}
	 } 

}

