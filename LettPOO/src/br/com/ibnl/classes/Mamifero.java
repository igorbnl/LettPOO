package br.com.ibnl.classes;


/*
 * A classe Mamifero é uma subclasse de Animal.
 * 
 * O fato de termos 2 animais e 1 com habilidade de voar e outro nao, 
 * foi necessário criar 2 construtores.
 * 
 * 
 */

public class Mamifero extends Animal{
	
	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public void amamentar() {
		System.out.println("consegue amamentar");
	}
	
	
	//vaca
	public Mamifero(int idade, double tamanho, String corPelo) {
		this.getIdade();
		this.getTamanho();
		this.getCorPelo();
	
	}
	
	//morcego
	public Mamifero(int idade, double tamanho, double altitude, String corPelo) {
		this.getIdade();
		this.getTamanho();
		this.getAltitude();
		this.getCorPelo();
	
	}

}
