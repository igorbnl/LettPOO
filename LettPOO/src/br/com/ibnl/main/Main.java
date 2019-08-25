package br.com.ibnl.main;

/*
 * Todas as classes foram previamentes instanciadas e em seguida os dados
 * são recebidos via console.
 * 
 * Foi utilizada a classe Scanner para  realizar a entrada de dados.
 * 
 * Após preencher os dados de todos os animais é gerado um relatório com os dados.
 * 
 * Ao inserir os dados é feito uma validação de dados, só será aceito números não negativos(>=0)
 * 
 */
import br.com.ibnl.classes.Aves;
import br.com.ibnl.classes.Mamifero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//iniciando as variaveis para instanciar as classes
		int idade = -1;
		double tamanho = -1, altitude = -1;
		String cor = "";
		
		Aves pato = new Aves(idade,tamanho,altitude,cor);		
		Aves galinha = new Aves(idade,tamanho,cor);	
		
		Mamifero vaca = new Mamifero(idade,tamanho,altitude,cor);	
		Mamifero morcego = new Mamifero(idade,tamanho,cor);
		//usando o Scanner para receber os dados via console
		Scanner input = new Scanner(System.in);
	
	//PATO	
		try {
			do{
				System.out.println("digite a idade do pato(apenas números não negativos): ");
				idade = input.nextInt();
					if (idade >= 0 ) {
						pato.setIdade(idade);
					}			
				}while(idade < 0);
		} catch (Exception e) {
			System.out.println("ERRO. O campo Idade só aceita números: "+e.getMessage());
			System.exit(1);
		}
		
		try {
			do{
				System.out.println("digite o tamanho do pato em metros(apenas números não negativos): ");
				tamanho = input.nextDouble();
					if (tamanho >= 0.0 ) {
						pato.setTamanho(tamanho);
					}			
				}while(tamanho < 0.0);
		} catch (Exception e) {
			System.out.println("ERRO. O campo tamanho só aceita números: "+e.getMessage());
			System.exit(1);
		}
		
		try {
			do{
				System.out.println("digite a altitude que o pato consegue voar(apenas números não negativos): ");
				altitude = input.nextDouble();
					if (altitude >= 0.0 ) {
						pato.setAltitude(altitude);
					}			
				}while(altitude < 0.0);
		} catch (Exception e) {
			System.out.println("ERRO. O campo Altitude só aceita números: "+e.getMessage());
			System.exit(1);
		}
		input.nextLine();
		System.out.println("Digite a cor da pena do pato");
		cor = input.nextLine();
		pato.setCorPena(cor);

//GALINHA
		try {
			do{
				System.out.println("digite a idade da galinha(apenas números não negativos): ");
				idade = input.nextInt();
					if (idade >= 0 ) {
						galinha.setIdade(idade);
					}			
				}while(idade < 0);
		} catch (Exception e) {
			System.out.println("ERRO. O campo Idade só aceita números: "+e.getMessage());
			System.exit(1);
		}
		
		try {
			do{
				System.out.println("digite o tamanho da galinha em metros(apenas números não negativos): ");
				tamanho = input.nextDouble();
					if (tamanho >= 0.0 ) {
						galinha.setTamanho(tamanho);
					}			
				}while(tamanho < 0.0);
		} catch (Exception e) {
			System.out.println("ERRO. O campo tamanho só aceita números: "+e.getMessage());
			System.exit(1);
		}
		
		input.nextLine();
		System.out.println("Digite a cor da pena da galinha");
		cor = input.nextLine();
		galinha.setCorPena(cor);

	//VACA
			try {
				do{
					System.out.println("digite a idade da Vaca(apenas números não negativos): ");
					idade = input.nextInt();
						if (idade >= 0 ) {
							vaca.setIdade(idade);
						}			
					}while(idade < 0);
			} catch (Exception e) {
				System.out.println("ERRO. O campo Idade só aceita números: "+e.getMessage());
				System.exit(1);
			}
			
			try {
				do{
					System.out.println("digite o tamanho da Vaca em metros(apenas números não negativos): ");
					tamanho = input.nextDouble();
						if (tamanho >= 0.0 ) {
							vaca.setTamanho(tamanho);
						}			
					}while(tamanho < 0.0);
			} catch (Exception e) {
				System.out.println("ERRO. O campo tamanho só aceita números: "+e.getMessage());
				System.exit(1);
			}
			input.nextLine();
			System.out.println("Digite a cor do pelo da vaca");
			cor = input.nextLine();
			vaca.setCorPelo(cor);

		
	//morcego
	try {
		do{
			System.out.println("digite a idade do morcego(apenas números não negativos): ");
			idade = input.nextInt();
				if (idade >= 0 ) {
					morcego.setIdade(idade);
				}			
			}while(idade < 0);
	} catch (Exception e) {
		System.out.println("ERRO. O campo Idade só aceita números: "+e.getMessage());
		System.exit(1);
	}
	
	try {
		do{
			System.out.println("digite o tamanho do morcego em metros(apenas números não negativos): ");
			tamanho = input.nextDouble();
				if (tamanho >= 0.0 ) {
					morcego.setTamanho(tamanho);
				}			
			}while(tamanho < 0.0);
	} catch (Exception e) {
		System.out.println("ERRO. O campo tamanho só aceita números: "+e.getMessage());
		System.exit(1);
	}
	
	try {
		do{
			System.out.println("digite a altitude que o morcego consegue voar(apenas números não negativos): ");
			altitude = input.nextDouble();
				if (altitude >= 0.0 ) {
					morcego.setAltitude(altitude);
				}			
			}while(altitude < 0.0);
	} catch (Exception e) {
		System.out.println("ERRO. O campo Altitude só aceita números: "+e.getMessage());
		System.exit(1);
	}
	
	input.nextLine();
	System.out.println("Digite a cor do pelo do morcego");
	cor = input.nextLine();
	morcego.setCorPelo(cor);
	
	
	System.out.println(String.format("**Caracteristicas do pato**\n"
			+ "| Idade: %d anos\t"
			+ "| Tamanho: %.2f metros\t"
			+ "| Altitude do vôo: %.2f metros\t"
			+ "| Cor das penas: %s\t |"
		, pato.getIdade(), pato.getTamanho(),pato.getAltitude(),pato.getCorPena()));
	
	pato.emitirSom("grasnido");
	pato.botarOvo();
	
	System.out.println("\n");
	
	System.out.println(String.format("**Caracteristicas da galinha**\n"
			+ "| Idade: %d anos\t"
			+ "| Tamanho: %.2f metros\t"
			+ "| Cor das penas: %s\t |"
		, galinha.getIdade(), galinha.getTamanho(),galinha.getCorPena()));
	
	galinha.emitirSom("cacarejo\t");
	galinha.botarOvo();
	
	System.out.println("\n");
	
	System.out.println(String.format("**Caracteristicas da Vaca**\n"
			+ "| Idade: %d anos\t"
			+ "| Tamanho: %.2f metros\t"
			+ "| Cor do pelo: %s |"
		, vaca.getIdade(), vaca.getTamanho(),vaca.getCorPelo()));
	
	vaca.emitirSom("mugido");
	vaca.amamentar();
	
	System.out.println("\n");
	
	System.out.println(String.format("**Caracteristicas do morcego**\n"
			+ "| Idade: %d anos\t"
			+ "| Tamanho: %.2f metros\t"
			+ "| Altitude do vôo: %.2f metros\t"
			+ "| Cor do pelo: %s |"
		, morcego.getIdade(), morcego.getTamanho(),morcego.getAltitude(),morcego.getCorPelo()));
	
	morcego.emitirSom("farfalho");
	morcego.amamentar();
}
	
}

