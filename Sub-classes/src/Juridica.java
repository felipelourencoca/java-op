
public class Juridica extends Pessoa {
	
	private String cnpj;
	public Juridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String mostrarDocumento() {
		return this.cnpj;
	}
}
