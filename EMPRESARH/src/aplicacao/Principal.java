package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Funcionario;
import entidades.Terceiro;
public class Principal {
	// Digite o numero de funcionarios para cadastro:
	// quantos funcionarios ?? 1,2,3
	// cada funcionario é um objeto
	// lance os dados por objeto
	// pedi o nome --> nome
	//pedi horas
	// valor por hora
	// e os terceiros??? tem quer pra terceiro
	// horas adicionais
	// mostra nome - salario do funcionario
	public static void main(String[] args) {
		List<Funcionario> funcionario = new ArrayList<Funcionario>();
		List<Terceiro> terceiros = new ArrayList<Terceiro>();
		Scanner scanf = new Scanner(System.in);
		int colaboradores, escolha;
		System.out.print("Digite a quantidade de colaboradores: ");
		colaboradores = scanf.nextInt();
		for(int i=0; i<colaboradores; i++) {
			System.out.print("\n\n1 - Funcionario | 2 - Terceirizado: ");
			escolha = scanf.nextInt();
			if(escolha == 1) {
				funcionario.add(new Funcionario());
				System.out.print("Digite seu nome: ");
				funcionario.get(funcionario.size()-1).setNome(scanf.next());
				System.out.print("Digite suas horas trabalhadas: ");
				funcionario.get(funcionario.size()-1).setHorasTrabalhadas(scanf.nextInt());
				System.out.print("Digite o valor da sua hora de trabalho: ");
				funcionario.get(funcionario.size()-1).setValorPorHora(scanf.nextDouble());
				System.out.print("\n------------------------------------------\n");
				System.out.printf("Funcionario(a) %s recebeu %.2f ", funcionario.get(funcionario.size()-1).getNome(), funcionario.get(funcionario.size()-1).pagamento());
				System.out.print("\n------------------------------------------\n");
			} else {
				terceiros.add(new Terceiro());
				System.out.print("Digite seu nome: ");
				terceiros.get(terceiros.size()-1).setNome(scanf.next());
				System.out.print("Digite suas horas trabalhadas: ");
				terceiros.get(terceiros.size()-1).setHorasTrabalhadas(scanf.nextInt());
				System.out.print("Digite o valor da sua hora de trabalho: ");
				terceiros.get(terceiros.size()-1).setValorPorHora(scanf.nextDouble());
				System.out.print("Digite o valor da sua hora extra: ");
				terceiros.get(terceiros.size()-1).setHorasAdicionais(scanf.nextDouble());
				System.out.print("\n------------------------------------------\n");
				System.out.printf("Terceirizado(a) %s recebeu %.2f ", terceiros.get(terceiros.size()-1).getNome(), terceiros.get(terceiros.size()-1).pagamento());
				System.out.print("\n------------------------------------------\n");
			}
		}
		scanf.close();
	}

}