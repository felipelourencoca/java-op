
public class Cachorro extends Mamifero{

	public Cachorro(String nome, int idade, Integer glandulasMamarias) {
		super(nome, idade, glandulasMamarias);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Au au!");
		
	}

}
