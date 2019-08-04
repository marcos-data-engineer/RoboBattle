package modelo.batalhas;

import modelo.robos.Lutador;

public class BatalhaEmTurnos extends Batalha{
	
	Lutador vencedorLuta1;
	Lutador vencedorLuta2;
	Lutador vencedorLuta3;
	Lutador vencedorLuta4;
	Lutador vencedorSemifinal1;
	Lutador vencedorSemifinal2;
	
	public BatalhaEmTurnos() {
		super();
	}
	
	@Override
	public void iniciar() {
		System.out.println("\nBEM VINDOS AO CAMPEONATO MUNDIAL DE ROBÔS \n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nSão 8 grandes robôs da história, e somente um chegará ao fim desta batalha Épica! \n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nSão eles: \n");
		System.out.println("\nSonny:\n");
		System.out.println("Estrela do filme Eu, Robô (2004), ");
		System.out.println("enfrenta o Detetive Spooner, interpretado por Will Smith. \n");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nSophia:\n");
		System.out.println("É um robô humanoide desenvolvido pela empresa");
		System.out.println("Hanson Robotics, de Hong Kong, capaz de reproduzir 62 expressões faciais.");
		System.out.println("Projetado para aprender, adaptar-se ao comportamento humano e trabalhar com seres humanos.");
		System.out.println("Em outubro de 2017, tornou-se o primeiro robô a receber a cidadania de um país (Arábia Saudita) \n");
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nUltron:\n");
		System.out.println("É um personagem da editora de histórias em quadrinhos da Marvel.");
		System.out.println("Ele é um robô super-vilão inimigo dos Vingadores. ");
		System.out.println("Foi criado por Roy Thomas e John Buscema e sua primeira aparição foi em Avengers.\n");
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nAstro Boy:\n");
		System.out.println("É um mangá de Osamu Tezuka produzido de abril de 1952 a março de 1968, "); 
		System.out.println("ganhando diversas adaptações para a televisão em anime. ");
		System.out.println("Por ter sido a primeira série animada exibida no Japão, tornou-se referência na área. ");
		System.out.println("As transmissões tiveram início a partir de 1963, ");
		System.out.println("com seu sucesso deram origem à indústria japonesa de animação. \n");
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nT-800:\n");
		System.out.println("Seu nome técnico é Cyberdyne Systems Modelo 101, ");
		System.out.println("série 800 (que gera sua alcunha mais utilizada, T-800)."); 
		System.out.println("o Exterminador é enviado para 1984 com a intenção de matar Sarah Connor, ");
		System.out.println("que seria mãe do futuro líder da resistência humana contra as máquinas, John Connor. \n");
					
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nWall-e:\n");
		System.out.println("É um filme de animação americano de 2008 produzido pela Pixar Animation Studios");
		System.out.println(" e dirigido por Andrew Stanton."); 
		System.out.println(" A história segue um robô chamado WALL·E, ");
		System.out.println(" criado no ano de 2100 para limpar a Terra coberta por lixo. \n");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nBaymax:\n");
		System.out.println("Na cidade futurística cidade de San Fransokyo, ");
		System.out.println(" o ás da robótica Hiro Hamada e o robô Baymax reúnem uma equipe de guerreiros inexperientes"); 
		System.out.println(" para enfrentar os inimigos que ameaçam a paz do local. (operação Big Hero) \n");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nC-3PO:\n");
		System.out.println("É um androide do mundo fictício de Star Wars (Guerra nas Estrelas).");
		System.out.println("É um droide de protocolo (intérprete e relações-sociais) fluente em 6 milhões de meios de comunicação. "); 
		System.out.println(" Foi inspirado na robô Maschinenmensch de Metrópolis. \n");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.print("Que se iniciem os combates!!! .............................................................................................................................");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".......................................................................................................................................................................................................................");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(".......................................................................................................................................................................................................................");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print(".......................................................................................................................................................................................................................");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print(".......................................................................................................................................................................................................................");

		System.out.println("\nIniciando a luta 1 ...\n");	
		System.out.println("\nSonny vs Sophia\n");	
		
		try {
			Thread.sleep(3000);
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
						System.out.println("\nIniciando um novo combate para desempate...\n");
						int turno1 = 0;
						while(lutador1.estaVivo() && lutador2.estaVivo()) {
							lutador1.atacar(lutador2);
							lutador2.atacar(lutador1);
							System.out.println("\nTurno "+ ++turno1 + "\n");
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
					}else {
						System.out.println("EMPATE!\n");
					} 
		}
	}
	
	@Override
	public void iniciar2() {
		System.out.println("\nIniciando a luta 2 ...\n");	
		System.out.println("\nUltron vs AstroBoy\n");

		try {
			Thread.sleep(3000);
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
						System.out.println("\nIniciando um novo combate para desempate...\n");
						int turno2 = 0;
						while(lutador3.estaVivo() && lutador4.estaVivo()) {
							lutador3.atacar(lutador4);
							lutador4.atacar(lutador3);
							System.out.println("\nTurno "+ ++turno2 + "\n");
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
						}
		}
	} 

	@Override
	public void iniciar3() {
		System.out.println("\nIniciando a luta 3 ...\n");	
		System.out.println("\nT-800 vs Wall-e\n");

		try {
			Thread.sleep(3000);
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
						System.out.println("\nIniciando um novo combate para desempate...\n");
						int turno3 = 0;
					while(lutador5.estaVivo() && lutador6.estaVivo()) {
						lutador5.atacar(lutador6);
						lutador6.atacar(lutador5);
						System.out.println("\nTurno "+ ++turno3 + "\n");
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
					}
		}
	} 

	@Override
	public void iniciar4() {
		System.out.println("\nIniciando a luta 4 ...\n");	
		System.out.println("\nBaymax vs C-3PO\n");

		try {
			Thread.sleep(3000);
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
		}else if(lutador8.estaVivo()) {
			System.out.println(lutador8+" foi o vencedor!\n");
			vencedorLuta4 = lutador8;
		} else {
							System.out.println("EMPATE!\n");
							System.out.println("\nIniciando um novo combate para desempate...\n");
							int turno4 = 0;
						while(lutador7.estaVivo() && lutador8.estaVivo()) {
							lutador7.atacar(lutador8);
							lutador8.atacar(lutador7);
							System.out.println("\nTurno "+ ++turno4+ "\n");
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
						}else if(lutador8.estaVivo()) {
							System.out.println(lutador8+" foi o vencedor!\n");
							vencedorLuta4 = lutador8;
						} else {
							System.out.println("EMPATE!\n");
						}
		}
	} 

	 @Override
	 public void iniciar5() {
		 System.out.println("\nIniciando a 1ª semifinal ...\n");	
		 System.out.println("\nOs lutadores estão cansados por causa da primeira luta! ...\n");
	 	System.out.println("\n"+vencedorLuta1+" vs "+vencedorLuta2+"\n");

	 	try {
	 		Thread.sleep(3000);
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
						System.out.println("\nIniciando um novo combate para desempate...\n");
						int turno5 = 0;
						while(vencedorLuta1.estaVivo() && vencedorLuta2.estaVivo()) {
							vencedorLuta1.atacar(vencedorLuta2);
							vencedorLuta2.atacar(vencedorLuta1);
							System.out.println("\nTurno "+ ++turno5 + "\n");
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
						}
	 	}
	 } 

	 @Override
	 public void iniciar6() {
		 System.out.println("\nIniciando a 2ª semifinal ...\n");	
		 System.out.println("\nOs lutadores estão exaustos por causa da primeira luta! ...\n");
	 	System.out.println("\n"+vencedorLuta3+" vs "+vencedorLuta4+"\n");

	 	try {
	 		Thread.sleep(3000);
	 	} catch (InterruptedException e) {
	 		e.printStackTrace();
	 	}
		
	 	int turno = 0;
	 	while(vencedorLuta3.estaVivo() && vencedorLuta4.estaVivo()) {
	 		vencedorLuta3.atacar(vencedorLuta4);
	 		vencedorLuta4.atacar(vencedorLuta3);
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
						System.out.println("\nIniciando um novo combate para desempate...\n");
						int turno6 = 0;
					while(vencedorLuta3.estaVivo() && vencedorLuta4.estaVivo()) {
						vencedorLuta3.atacar(vencedorLuta4);
						vencedorLuta4.atacar(vencedorLuta3);
						System.out.println("\nTurno "+ ++turno6 + "\n");
						System.out.println(vencedorLuta3);
						System.out.println(vencedorLuta4);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if(vencedorLuta3.estaVivo()) {
						System.out.println(vencedorLuta3+" foi o vencedor!\n");
						vencedorSemifinal2 = vencedorLuta3;
					}else if(vencedorLuta4.estaVivo()) {
						System.out.println(vencedorLuta4+" foi o vencedor!\n");
						vencedorSemifinal2 = vencedorLuta4;
					} else {
						System.out.println("EMPATE!\n");
					}
	 	}
	 } 

	 @Override
	 public void iniciar7() {
		 System.out.println("\nIniciando a grande Final ...\n");
		 System.out.println("\nEsta luta será rápida, pois os lutadores já estão muito danificados!!!\n");	
	 	System.out.println("\n"+vencedorSemifinal1+" vs "+vencedorSemifinal2+"\n");

	 	try {
	 		Thread.sleep(3000);
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
	 	if(vencedorSemifinal1.estaVivo()) {
			System.out.println(vencedorSemifinal1+" foi o vencedor!\n");
			System.out.println("\n PARABÉNS!!! \n");
			System.out.println(vencedorSemifinal1+"\n");
			System.out.println("\n VOCÊ FOI O GRANDE CAMPEÃO!!! \n");
	 	}else if(vencedorSemifinal2.estaVivo()) {
	 		System.out.println(vencedorSemifinal2+" foi o vencedor!\n");
			System.out.println("\n PARABÉNS!!! \n");
			System.out.println(vencedorSemifinal2+"\n");
			System.out.println("\n VOCÊ FOI O GRANDE CAMPEÃO!!! \n");
	 	} else {
						System.out.println("EMPATE!\n");
						System.out.println("\nIniciando um novo combate para desempate...\n");
						int turno7 = 0;
					while(vencedorSemifinal1.estaVivo() && vencedorSemifinal2.estaVivo()) {
						vencedorSemifinal1.atacar(vencedorSemifinal2);
						vencedorSemifinal2.atacar(vencedorSemifinal1);
						System.out.println("\nTurno "+ ++turno7 + "\n");
						System.out.println(vencedorSemifinal1);
						System.out.println(vencedorSemifinal2);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if(vencedorSemifinal1.estaVivo()) {
						System.out.println(vencedorSemifinal1+" foi o vencedor!\n");
						System.out.println("\n PARABÉNS!!! \n");
						System.out.println(vencedorSemifinal1+"\n");
						System.out.println("\n VOCÊ FOI O GRANDE CAMPEÃO!!! \n");
					}else if(vencedorSemifinal2.estaVivo()) {
						System.out.println(vencedorSemifinal2+" foi o vencedor!\n");
						System.out.println("\n PARABÉNS!!! \n");
						System.out.println(vencedorSemifinal2+"\n");
						System.out.println("\n VOCÊ FOI O GRANDE CAMPEÃO!!! \n");
					} else {
						System.out.println("EMPATE!\n");
					}
	 } 
	}
}

