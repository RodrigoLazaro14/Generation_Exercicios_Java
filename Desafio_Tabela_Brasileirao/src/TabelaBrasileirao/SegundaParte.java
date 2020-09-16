package TabelaBrasileirao;

import java.util.Locale;
import java.util.Scanner;

public class SegundaParte {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		int r=0, c=0; //c: contador  pontotime:pontos de cada time   pontos:pontuação na rodada
		int[] pontoTime = {0,0,0,0};
		int pontos =0;
		String[] vTimes = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"};
		
	
		for(r=0;r<3;r++) 
		{
			for(c=0;c<4;c++)
			{
				System.out.printf(" %s 1 - ganhou, 2 - empatou, ou 3 - perdeu? \n", vTimes[c]);
				pontos=kb.nextInt();
						
				if(pontos==1)
				{
					pontoTime[c]=pontoTime[c]+3;
				}
				else if(pontos==2)
				{
					pontoTime[c]=pontoTime[c]+1;
				}
				else if(pontos==3)
				{
					pontoTime[c]=pontoTime[c];
				}
			}
		
		}
		
		for(int tabela=0; tabela<4; tabela++)
		{
			System.out.printf("%s tem %d ptos. \n", vTimes[tabela], pontoTime[tabela]);
		}
	
		kb.close();
	}

}

