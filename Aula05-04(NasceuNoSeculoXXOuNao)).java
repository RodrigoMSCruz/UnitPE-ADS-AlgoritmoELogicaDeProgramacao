/******************************************************************************
Elabore um programa para ler o ano de nascimento de uma pessoa e mostrar:
    *Se a pessoa nasceu no ano 2000: “Você nasceu no ano da virada do século”
    *Se a pessoa não nasceu no ano 2000: “Você não nasceu no ano da virada do século”

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int anoNascimento;
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.print("Digite o ano do seu nascimento: ");
	    anoNascimento = ler.nextInt();
	    if (anoNascimento == 2000){
	        System.out.println("Você nasceu no ano da virada do século.");
	    }
	    else {
	        System.out.println("Você não nasceu no ano da virada do século.");
	    }
		ler.close();
	}
}
