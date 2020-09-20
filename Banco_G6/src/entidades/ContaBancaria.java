package entidades;

public abstract class ContaBancaria 
{
	
	
	private String nomeCliente;
	private int numeroConta;
	private double saldo;
	private double entrada;
	private double saida;
	
	// Constructor
	
	public ContaBancaria(String nomeCliente, int numeroConta) 
	{
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
	}

	// Getters and Setters 
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}
	
	// Meus métodos:
	
	public double credito()
	{
		return this.entrada;
	}
	
	public double debito()
	{
		return this.saida;
	}
	
	public double transacoes()
	{
		this.saldo = this.entrada - this.saida;
		return this.saldo;
	}
	
	public void emiteExtrato() 
	{
		System.out.println("Crédito: "+ this.entrada);
		System.out.println("Débito: "+ this.saida);
		System.out.println("Saldo: "+ this.saldo);
	}
}
