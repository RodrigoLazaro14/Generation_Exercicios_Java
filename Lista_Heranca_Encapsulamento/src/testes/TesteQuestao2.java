package testes;

import java.util.Scanner;

import entidades.Fornecedor;

public class TesteQuestao2 {

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		Fornecedor fornecedor1 = new Fornecedor();
		
		System.out.print("Digite o nome do fornecedor: ");
		fornecedor1.setNomePessoa(tec.nextLine());
		System.out.print("Digite o endereço do fornecedor: ");
		fornecedor1.setEndereco(tec.nextLine());
		System.out.print("Digite o telefone do fornecedor: ");
		fornecedor1.setTelefone(tec.nextLine());
		tec.nextLine();
		System.out.print("Digite o valor do crédido: R$");
		fornecedor1.valorCredito = tec.nextDouble();
		System.out.print("Digite o valor da dívida: R$");
		fornecedor1.valorDivida = tec.nextDouble();
		
		fornecedor1.obterSaldo();
	}

}
