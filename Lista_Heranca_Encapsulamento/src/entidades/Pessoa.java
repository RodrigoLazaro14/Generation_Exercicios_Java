package entidades;

public class Pessoa 
{
	private String nomePessoa;
	private String endereco;
	private String telefone;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nomePessoa) 
	{
		this.nomePessoa = nomePessoa;
	}

	//Constructors
	public Pessoa(String nomePessoa, String endereco) 
	{
		this.nomePessoa = nomePessoa;
		this.endereco = endereco;
	}


	public Pessoa(String nomePessoa, String endereco, String telefone) 
	{
		this.nomePessoa = nomePessoa;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	//Setters and getters
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	
	
	
	
	
}
