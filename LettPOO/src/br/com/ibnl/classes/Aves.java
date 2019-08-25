package br.com.ibnl.classes;

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
	public Aves(int idade, double tamanho, double altura, String corPena) {
		this.getIdade();
		this.getTamanho();
		this.getAltura();
		this.getCorPena();
		
	}
	
	//galinha
	public Aves(int idade, double tamanho, String corPena) {
		this.getIdade();
		this.getTamanho();
		this.getCorPena();	
	}

}
