package aplicacao;
import java.util.Scanner;

import entidades.Disciplina;
import entidades.Pessoa;
public class Cadastro {
	public static void main(String[] args)
	{
		Scanner tec = new Scanner(System.in);
		
		Pessoa pessoaTeste1= new Pessoa("ED");
		Pessoa pessoaTeste2 = new Pessoa("Xururu",'F');
		Disciplina disciplinaTeste = new Disciplina("PORTUGUES");
		Disciplina disciplinaTeste2 = new Disciplina("MATEMATICA");
	
		System.out.println("Digite um novo nome");
		pessoaTeste2.setNome(tec.nextLine());
		
		System.out.println(pessoaTeste2.getNome());
	}
}