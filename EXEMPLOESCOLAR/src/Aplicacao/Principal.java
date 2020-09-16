package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Principal 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Aluno primeiroAluno = new Aluno();
		double mediaMin;
		
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");
		System.out.print("\nDigite o nome do aluno: ");
		primeiroAluno.nomeAluno = teclado.nextLine().toUpperCase(); //.toUpperCase deixa tudo em maíusculo.
		System.out.print("Digite o sexo do aluno: ");
		primeiroAluno.sexoAluno = teclado.next().toUpperCase().charAt(0);
		
		teclado.nextLine();
		
		for(int c=0; c<4; c++)
		{
			System.out.printf("Digite a nota %d: ", (c+1));
			primeiroAluno.notas[c] = teclado.nextDouble();
		}
		
		System.out.println("Qual a média mínima para ser aprovado? ");
		mediaMin = teclado.nextDouble();
		
		primeiroAluno.mostra();
	
		
		primeiroAluno.mediaAluno();
		primeiroAluno.reprovouPassou(mediaMin);

		
	}

}
