package questoes;

public class Questao7 
{
	public String nomePaciente;
    public int matriculaPaciente;
    public String datanascimentoPaciente;
    public char sexoPaciente;

    public void mostra() 
    {
        System.out.printf("\nMatr�cula: %d ", matriculaPaciente);
        System.out.printf("\nPaciente: %s ", nomePaciente);
        System.out.printf("\nSexo: %s ", sexoPaciente);
        System.out.printf("\nData de Anivers�rio: %s ", datanascimentoPaciente);          
    }
}
