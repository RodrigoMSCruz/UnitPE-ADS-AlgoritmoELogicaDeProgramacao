/******************************************************************************
Sabendo-se que para uma eleição estão concorrendo 3 candidatos, elabore um
programa que receba o nome dos candidatos e os votos obtidos, informe o nome
do candidato vencedor.
Obs.: Considerar que não houve quantidade de votos empatada.
 
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    char voto;
	    int candidatoA, candidatoB, candidatoC;
	    Scanner ler = new Scanner(System.in);
	    
	    candidatoA = candidatoB = candidatoC = 0;
	    
	    do{
	        System.out.print("\nEleição - Digite para votar nos candidatos A, B e C. P para parar: ");
	        voto = ler.nextLine().charAt(0);
	        voto = Character.toUpperCase(voto);
	        if(voto == 'A'){
	           candidatoA++; 
	        }
	        if(voto == 'B'){
	            candidatoB++;
	        }
	        if(voto == 'C'){
	            candidatoC++;
	        }
	    }while(voto != 'P');
	    System.out.println("RESULTADO DA ELEIÇÃO:");
	    System.out.printf("\nCandidato A: %d", candidatoA);
	    System.out.printf("\nCandidato B: %d", candidatoB);
	    System.out.printf("\nCandidato C: %d", candidatoC);
	}
}
