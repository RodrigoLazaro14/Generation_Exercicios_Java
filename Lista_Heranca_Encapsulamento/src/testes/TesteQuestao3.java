package testes;

import java.util.Locale;

import entidades.Empregado;

public class TesteQuestao3 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Empregado empregado1 = new Empregado("Zezim", "0001", 1999.89, 0.25); //0.25 = 25%
		
		System.out.printf("\nFuncionário %s, código do setor %s", empregado1.getNomePessoa(), empregado1.getCodigoSetor());
		System.out.println("\nSalário base: R$"+ empregado1.getSalarioBase());
		System.out.println("Imposto: "+ empregado1.getImposto()*100+"%");
		empregado1.calcularSalario();
	}

}
