package exercicios;

import java.util.Scanner;

import questoes.Questao1;
import questoes.Questao2;
import questoes.Questao7;


public class Principal {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int escolha=0;
		Questao1 cliente = new Questao1();
		Questao2 aviao = new Questao2();
		Questao7 novoPaciente = new Questao7();
		
		
		System.out.print("Escolha o número qual questão você quer exibir: ");
		escolha = teclado.nextInt();
		
		teclado.nextLine();
		
		if(escolha==1)
		{
			teclado.nextLine();
			System.out.print("\nDigite o nome do cliente: ");
			cliente.nomeCliente = teclado.next().toUpperCase();
	
			teclado.nextLine();	// Para limpar o buffer de memória.
	
			System.out.print("Digite o cadastro do cliente: ");
			cliente.cadastroCliente = teclado.nextInt();
			System.out.print("Digite o ano de cadastro deste cliente: ");
			cliente.dataDoCadastro = teclado.nextInt();
			System.out.print("Digite o crédito que esse cliente tem: R$");
			cliente.creditoCliente = teclado.nextDouble();
			System.out.print("Digite o valor da compra: R$");
			cliente.compraCliente = teclado.nextDouble();
			
			cliente.informacoesCliente();
		}
		else if(escolha==2)
		{
			
			System.out.print("\nDigite o nome da companhia: ");
			aviao.nomeEmpresa = teclado.nextLine();
			System.out.print("Digite o destino: ");
			aviao.destino = teclado.nextLine();
			System.out.print("Digite a partida: ");
			aviao.partida = teclado.nextLine();
			teclado.nextLine();
			System.out.print("Digite a quantidade de assentos ocupados: ");
			aviao.assentosOcupados = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Digite o preço da passagem: R$");
			aviao.precoPassagem = teclado.nextDouble();
			System.out.println("\n");
			
			aviao.informacoesAviao();
		}
		else if(escolha==3)
		{
			
		}
		else if(escolha==4)
		{
			
		}
		else if(escolha==5)
		{
			
		}
		else if(escolha==6)
		{
			
		}
		else if(escolha==7)
		{
			System.out.println("\nHOSPITAL\n");
	        
	        System.out.print("Digite a matrícula: ");
	        novoPaciente.matriculaPaciente = teclado.nextInt();
	                
	        System.out.print("Digite seu nome: ");
	        novoPaciente.nomePaciente = teclado.next().toUpperCase();
	        
	        teclado.nextLine();
	        
	        System.out.print("Sexo[M/F]: ");
	        novoPaciente.sexoPaciente = teclado.next().toUpperCase().charAt(0);
	        
	        teclado.nextLine();
	        
	        System.out.print("Data de Nascimento: ");
	        novoPaciente.datanascimentoPaciente = teclado.nextLine();
	        
	        novoPaciente.mostra();
		}
		
		teclado.close();
	}

}
