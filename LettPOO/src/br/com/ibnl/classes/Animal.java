package br.com.ibnl.classes;

import br.com.ibnl.interfaces.AnimalInterface;

public abstract class Animal implements AnimalInterface {

	protected int idade;
	protected double tamanho, altura;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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
