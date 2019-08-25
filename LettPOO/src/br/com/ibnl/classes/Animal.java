package br.com.ibnl.classes;

import br.com.ibnl.interfaces.AnimalInterface;


/*
 * Foi implentado a classe Animal como principal e como herança as classes Aves e Mamiferos;
 * 
 * A interface Animal foi implementada nessa classe para forcar o uso do método emitirSom();
 * 
 * Foi utilizando o encapsulamento para não deixar os atributos da classe serem acessados diretamente,
 * com isso, foi gerado os métodos acessores getters e setters;
 * 
 * Cada animal emite um som diferente, foi criado um método que recebe o som emitido por parametro.
 * 
 * Alguns animais tem a habilidade de voar mas cada um tem sua altidude própria, essa altitude e recebida via 
 * parâmentro no método altitude()
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
		System.out.println("O som emitido é um "+som);
	}

	public void altitude(double metros) {
		
			System.out.println("a altura maxima e"+metros);
		
	}
	
	
	
}
