
public class Fisica extends Pessoa{
	private String cpf;
	public Fisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	@Override
	public String mostrarDocumento() {
		return this.cpf;
		
	}

		
}
