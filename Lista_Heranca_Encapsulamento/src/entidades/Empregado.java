package entidades;

public class Empregado extends Pessoa
{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nomePessoa)
	{
		super(nomePessoa);
	}
	
	public Empregado(int codigoSetor, double salarioBase, double imposto) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public Empregado(String nomePessoa, int codigoSetor, double salarioBase, double imposto)
	{
		super(nomePessoa);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public Empregado(String nomePessoa, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto)
	{
		super(nomePessoa, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario() 
	{
		double salario = salarioBase*imposto;
		salario = salarioBase - salario;
		System.out.printf("\nO salário do funcionário é de: R$%.2f",salario);
		
	}
	
}
