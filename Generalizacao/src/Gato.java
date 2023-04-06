
public class Gato extends Mamifero {

	public Gato(String nome, int idade, Integer glandulasMamarias) {
		super(nome, idade, glandulasMamarias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Miau!");
		
	}

}
