package entidades;

public class ContaCorrente extends ContaBancaria
{
	private int talonario;
	private double deposito;
	private double saque;
	private double chequeCompensado;	//SAI
	private double chequeRecebido;		//ENTRA
	double depositoTotal;
	double saqueTotal;
	double chequeCompensadoTotal;	//SAI
	double chequeRecebidoTotal;		//ENTRA
	double entradaTotal;
	double saidaTotal;
	
	public double teste;
	
	// Constructors
	
	public ContaCorrente(String nomeCliente, int numeroConta) 
	{
		super(nomeCliente, numeroConta);
	}
	
	// Getters and Setters
	
	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public double getChequeCompensado() {
		return chequeCompensado;
	}

	public void setChequeCompensado(double chequeCompensado) {
		this.chequeCompensado = chequeCompensado;
	}

	public double getChequeRecebido() {
		return chequeRecebido;
	}

	public void setChequeRecebido(double chequeRecebido) {
		this.chequeRecebido = chequeRecebido;
	}

	
	// Meus métodos
	
	
	public void menuCliente()
	{
		System.out.println("1 - Depósito");
		System.out.println("2 - Saque");
		System.out.println("3 - Talonário");
		System.out.println("4 - Extrato");
	}
	
	public void chequeCompensado()
	{
		chequeCompensadoTotal = chequeCompensadoTotal + this.chequeCompensado;
	}
	
	public void chequeRecebido()
	{
		chequeRecebidoTotal = chequeRecebidoTotal + this.chequeRecebido;
	}
	public void emiteTalonario()
	{
		System.out.println("Número totais de transações com cheques: "+ this.talonario);
	}
	
	public void depositar()
	{
		depositoTotal = depositoTotal + this.deposito;
	//	super.setEntrada(depositoTotal);
	}
	
	public void sacar()
	{
		saqueTotal = saqueTotal + this.saque;
	//	super.setSaida(saqueTotal);
	}
	
	public void testes()
	{
		this.teste = saqueTotal;
		System.out.println("Valor total de deposito: "+this.teste);
	}
	
	public void balancoTotal()
	{
		entradaTotal = depositoTotal + chequeRecebidoTotal;
		super.setEntrada(entradaTotal);
		saidaTotal = saqueTotal + chequeCompensadoTotal;
		super.setSaida(saidaTotal);
	}
	
	
}
