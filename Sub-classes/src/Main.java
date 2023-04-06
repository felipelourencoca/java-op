
public class Main {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gabriel");
		System.out.println(p.mostrarDocumento());
		Fisica f = new Fisica("Marcela", "23233232");
		System.out.println(f.mostrarDocumento());
		Juridica j = new Juridica("Lucas", "232334544");
		System.out.println(j.mostrarDocumento());
	}

}
