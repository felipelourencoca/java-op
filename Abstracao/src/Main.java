
public class Main {
	public static void main(String[] args) {
		//Animal a = new Animal();
		//Animal gato = new Gato();
		// System.out.println(gato.miar()); Nao funciona, referencia fraca
		 
		Gato g = new Gato();
		g.miar();
		g.comer();
		Cachorro c = new Cachorro();
		c.latir();
		c.comer();
		
	}
}
