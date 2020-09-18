package entidades;
public class Terceiro extends Funcionario {
	private double horasAdicionais;
	// Construtores	
	public Terceiro() {
	}
	public Terceiro(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}
	public Terceiro(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	@Override
	public double pagamento() {
		return super.pagamento() + (horasAdicionais * this.getValorPorHora());
	}
	// Get's e Set's
	public double getHorasAdicionais() {
		return horasAdicionais;
	}
	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
}





