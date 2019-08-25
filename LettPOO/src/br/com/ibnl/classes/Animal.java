package br.com.ibnl.classes;

import br.com.ibnl.interfaces.AnimalInterface;


/*
 * Foi implentado a classe Animal como principal e como heran�a as classes Aves e Mamiferos;
 * 
 * A interface Animal foi implementada nessa classe para forcar o uso do m�todo emitirSom();
 * 
 * Foi utilizando o encapsulamento para n�o deixar os atributos da classe serem acessados diretamente,
 * com isso, foi gerado os m�todos acessores getters e setters;
 * 
 * Cada animal emite um som diferente, foi criado um m�todo que recebe o som emitido por parametro.
 * 
 * Alguns animais tem a habilidade de voar mas cada um tem sua altidude pr�pria, essa altitude e recebida via 
 * par�mentro no m�todo altitude()
 */
public abstract class Animal implements AnimalInterface {

	protected int idade;
	protected double tamanho, altitude;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void emitirSom(String som) {
		System.out.println("O som emitido � um "+som);
	}

	public void altitude(double metros) {
		
			System.out.println("a altura maxima e"+metros);
		
	}
	
	
	
}
