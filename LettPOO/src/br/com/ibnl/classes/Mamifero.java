package br.com.ibnl.classes;

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
	public Mamifero(int idade, double tamanho, double altura, String corPelo) {
		this.getIdade();
		this.getTamanho();
		this.getAltura();
		this.getCorPelo();
	
	}

}
