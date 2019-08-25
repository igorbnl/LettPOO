package br.com.ibnl.interfaces;


/*Como todos os animais emitem som,
 * foi necessário implementar essa interface para "obrigar" 
 * as classes a utilizarem esse método
  */
public interface AnimalInterface {
	void emitirSom(String som);
}
