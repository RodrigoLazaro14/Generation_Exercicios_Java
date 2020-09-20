package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaCorrente;

public class Testes 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		// Digito conta = 1 --> Conta Corrente;
		
		Scanner teclado = new Scanner(System.in);
		ContaCorrente cliente1 = new ContaCorrente("João", 1234);
		
		int tecladoConta;
		int opcaoMenu;
		int contador=0;
		
		System.out.println("Seja bem vindo(a)");
		System.out.print("\nDigite o número da sua conta: ");
		tecladoConta = teclado.nextInt();
		
		if (tecladoConta == 1234)
		{
			System.out.printf("\nSeja bem vindo %s \n\n", cliente1.getNomeCliente());
			System.out.println("Qual operação deseja fazer?");
			cliente1.menuCliente();
			System.out.print("\nDigite sua opção: ");
			opcaoMenu = teclado.nextInt();	
			while(opcaoMenu==1)
			{
					System.out.print("\nDigite o valor do deposito: R$");
					cliente1.setDeposito(teclado.nextDouble());
					cliente1.depositar();
					System.out.println("Deposito realizado com sucesso.");
					System.out.println("\nO que deseja fazer agora?");
					cliente1.menuCliente();
					System.out.print("\nDigite sua opção: ");
					opcaoMenu = teclado.nextInt();					
			}
			while(opcaoMenu==2)
			{
					System.out.print("\nDigite o valor do saque: R$");
					cliente1.setSaque(teclado.nextDouble());
					cliente1.sacar();
					System.out.println("Saque realizado com sucesso.");
					System.out.println("\nO que deseja fazer agora?");
					cliente1.menuCliente();
					System.out.print("\nDigite sua opção: ");
					opcaoMenu = teclado.nextInt();					
			}
			while(opcaoMenu==3)
			{
				System.out.println("Digite 1 para chegue recebido e 2 para cheque compensado:");
				opcaoMenu = teclado.nextInt();
				
				while(opcaoMenu==1)
				{
					contador++;
					System.out.print("\nDigite o valor do cheque recebido: R$");
					cliente1.setChequeRecebido(teclado.nextDouble());
					System.out.println("Operação realizada com sucesso.");
					cliente1.chequeRecebido();
					System.out.println("\nO que deseja fazer agora?");
					cliente1.menuCliente();
					System.out.print("\nDigite sua opção: ");
					opcaoMenu = teclado.nextInt();	
				}
				while(opcaoMenu==2)
				{
					contador++;
					cliente1.setTalonario(+1);
					System.out.print("\nDigite o valor do cheque compensado: R$");
					cliente1.setChequeCompensado(teclado.nextDouble());
					System.out.println("Operação realizada com sucesso.");
					cliente1.chequeCompensado();
					System.out.println("\nO que deseja fazer agora?");
					cliente1.menuCliente();
					System.out.print("\nDigite sua opção: ");
					opcaoMenu = teclado.nextInt();	
				}
				
			}
			if(opcaoMenu==4)
			{
				cliente1.setTalonario(contador);
				cliente1.emiteTalonario();
				cliente1.balancoTotal();
				cliente1.transacoes();
				cliente1.emiteExtrato();
			}
		}
		
	}

}
