package br.com.ibnl.classes;


/*
 * A classe Aves é uma subclasse de Animal.
 * 
 * O fato de termos 2 animais e 1 com habilidade de voar e outro nao, 
 * foi necessário criar 2 construtores.
 * 
 * 
 */
public class Aves extends Animal {
	
	private String corPena;
	
	
	public String getCorPena() {
		return corPena;
	}


	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}


	public void botarOvo(){
		System.out.println("consegue botar ovo");
	}
	//pato
	public Aves(int idade, double tamanho, double altitude, String corPena) {
		this.getIdade();
		this.getTamanho();
		this.getAltitude();
		this.getCorPena();
		
	}
	
	//galinha
	public Aves(int idade, double tamanho, String corPena) {
		this.getIdade();
		this.getTamanho();
		this.getCorPena();	
	}

}
